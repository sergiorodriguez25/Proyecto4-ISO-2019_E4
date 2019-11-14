package com.tgs.tgh.dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.BsonDocument;

import com.mongodb.client.FindIterable;
import com.tgs.tgh.model.Cita;
import com.tgs.tgh.model.HorarioMedico;

public class CitaDAO {

	public static void introducirCita(Cita cita) {
		DBBroker.get().introducirCitaBD(cita);
	}

	public static void eliminarCita(Cita cita) throws Exception {
		boolean comprobar = DBBroker.get().eliminarCita(cita.getDniPaciente(), cita.getDia(), cita.getHora());
		if (!comprobar) {
			throw new Exception("Error al eliminar la cita");
		}
	}
	
	public static void modificarCita(Cita cita, String nuevoDia, String nuevaHora) throws Exception{
		System.out.println(cita.getDia());
		boolean comprobar = DBBroker.get().modificarCita(cita.getDniPaciente(), cita.getDia(), cita.getHora(), nuevoDia, nuevaHora);
		if (!comprobar) {
			throw new Exception("Error al modificar la cita");
		}
	}
	
	@SuppressWarnings("unchecked")
	public static List<Cita> getCitas(String dni) throws Throwable {
		return DBBroker.get().getCitaBD(dni);
	}

	public static ArrayList getCitasDiaMedico(String dniMedico, String fecha) {
		FindIterable<BsonDocument> docs = DBBroker.get().getCitasDiaMedico(dniMedico, fecha);
		System.out.println(docs);
		ArrayList lista = new ArrayList();
		BsonDocument bso = docs.first();
		System.out.println(bso);
		for (BsonDocument doc : docs) { 
			String hora;
			hora = doc.get("hora").asString().getValue();
			lista.add(hora);
		}
		return lista;
	}

}
