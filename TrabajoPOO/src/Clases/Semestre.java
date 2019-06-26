package Clases;

import java.util.ArrayList;

public class Semestre {
	
	//Atributos
	int num;
	ArrayList<Asignatura> asignaturas;
	
	//Constructores
	public Semestre() {
		asignaturas = new ArrayList<Asignatura>();
	}
	
	public Semestre(int num) {
		this.num = num;
		asignaturas = new ArrayList<Asignatura>();
	}

	
	
	//Métodos
	
	
	
	//Getters & Setters
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public ArrayList<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
}
