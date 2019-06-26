package Clases;

import java.util.ArrayList;

public class Alumno {
	
	//Atributos
	String nombre, apellido1, apellido2;
	int dni, numeroTelefono;
	ArrayList<AsignaturaMatriculada> asignaturas;
	

	//Constructores
	public Alumno(){
		asignaturas = new ArrayList<AsignaturaMatriculada>();
	
	}
	
	public Alumno(String nombre, String apellido1, String apellido2, int dni, int numeroTelefono) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.numeroTelefono = numeroTelefono;
		
	}
	
	//Métodos
	public void LeerAlumno() {
		
		return;
	}
	
	//Getters & Setters
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido1() {
			return apellido1;
		}

		public void setApellido1(String apellido1) {
			this.apellido1 = apellido1;
		}

		public String getApellido2() {
			return apellido2;
		}

		public void setApellido2(String apellido2) {
			this.apellido2 = apellido2;
		}

		public int getDni() {
			return dni;
		}

		public void setDni(int dni) {
			this.dni = dni;
		}

		public int getNumeroTelefono() {
			return numeroTelefono;
		}

		public void setNumeroTelefono(int numeroTelefono) {
			this.numeroTelefono = numeroTelefono;
		}
}
