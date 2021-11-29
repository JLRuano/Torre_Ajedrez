package org.iesalandalus.programacion.torreajedrez;

import java.util.Objects;

public class Posicion {
	private int fila;
	private char columna;
	

	
	//char[] f = {'1', '2', '3', '4', '5', '6', '7', '8'};
	//char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

	
	//Construccion (apartado 7)
		public Posicion (int f, char c) {
			
			setFila(f);
			setColumna(c);
		
		
		//	if ( !validaPosicion() )
		//		throw new IllegalArgumentException("ERROR. posicion no válida.");
		}

		//Constructor Copia (apartado 8)
			public Posicion (Posicion e) 
			{
				if (e==null)
					throw new NullPointerException("ERROR: No se puede copiar una posicion nula.");
				
				this.
				setFila(e.getFila());
				setColumna(e.getColumna());
			}

	
	
	
	//Get y set (apartado 6)

	private void setFila(int fila) {
		this.fila = fila;
	}
	
	public int getFila() {
		return fila;
	}	
		
	private void setColumna(char columna) {
		this.columna = columna;
	}
	
	public char getColumna() {
		return columna;
	}
	
	
	{
		if (fila <1 || fila >8) {
			throw new IllegalArgumentException ("error, fila no válida.");
			}	
	
	if (columna <'a' || columna > 'h')  {
		throw new IllegalArgumentException ("error, columna no válida.");
		}
	}

	
		
	//Equals y hasgCode (apartado 9)
		@Override
		public int hashCode() {
			return Objects.hash(columna, fila);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Posicion other = (Posicion) obj;
			return columna == other.columna && fila == other.fila;
		}
		
		
	//ToString (apartado 10)	
		@Override
		public String toString() {
			return "Posicion [fila=valorf, columna=valorc]";
		}
		
		

	}
	

	
	


