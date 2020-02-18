package org.iesalandalus.programacion.tutorias.mvc;

import org.iesalandalus.programacion.tutorias.mvc.controlador.Controlador;
import org.iesalandalus.programacion.tutorias.mvc.controlador.IControlador;
import org.iesalandalus.programacion.tutorias.mvc.modelo.FactoriaFuenteDatos;
import org.iesalandalus.programacion.tutorias.mvc.modelo.IModelo;
import org.iesalandalus.programacion.tutorias.mvc.modelo.Modelo;
import org.iesalandalus.programacion.tutorias.mvc.vista.IVista;
import org.iesalandalus.programacion.tutorias.mvc.vista.texto.VistaTexto;

public class MainApp {

	public static void main(String[] args) {
		IModelo modelo = new Modelo(FactoriaFuenteDatos.MEMORIA.crear());
		IVista vista = new VistaTexto();
		IControlador controlador = new Controlador(modelo, vista);
		controlador.comenzar();
	}

}
