package Clases;

import java.util.ArrayList;

public class Curso {
	
	//Atributos
	int num;
	ArrayList<Semestre> semestres;
	
	//Constructores
	public Curso() {
		semestres = new ArrayList<Semestre>();
		
	}
	
	public Curso(int num) {
		this.num = num;
		semestres = new ArrayList<Semestre>();
	}

	
	
	//Métodos
	
	
	
	//Getters & Setters
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public ArrayList<Semestre> getSemestres() {
		return semestres;
	}

	public void setSemestres(ArrayList<Semestre> semestres) {
		this.semestres = semestres;
	}
}
