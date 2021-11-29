package org.iesalandalus.programacion.torreajedrez;

import org.iesalandalus.programacion.torreajedrez.Color;
import org.iesalandalus.programacion.torreajedrez.Posicion;

import poo.Asignatura;

public class Torre {
	//color y posicion (apartado 11)
	

	
	
	public void Torre (Color NEGRO, Posicion 1h) { 
	}
	

	//get y set (apartado 12)
	public Color getBLANCO() {
		return BLANCO;
	}

	public void setBLANCO(Color bLANCO) {
		BLANCO = bLANCO;
	}

	public Posicion getF() {
		return f;
	}

	public void setF(Posicion f) {
		this.f = f;
	}

	public Posicion getC() {
		return c;
	}

	public void setC(Posicion c) {
		this.c = c;
	}
	
	public Torre() {
		setColor(negro);
		SetFila(8);
		setColumna(h);	
	}	
}
