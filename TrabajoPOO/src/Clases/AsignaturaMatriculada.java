package Clases;

public class AsignaturaMatriculada extends Asignatura{
	
	//Atributos
	float notaPractica, nota, notaSeptiembre;
	
	//Constructores
	public AsignaturaMatriculada() {
		super();
		
	}
	
	public AsignaturaMatriculada(String nombre, String tipo, float creditos) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.creditos = creditos;	
	}
	
	//Métodos
	
	//Getters & Setters
	public float getNotaPractica() {
		return notaPractica;
	}

	public void setNotaPractica(float notaPractica) {
		this.notaPractica = notaPractica;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public float getNotaSeptiembre() {
		return notaSeptiembre;
	}

	public void setNotaSeptiembre(float notaSeptiembre) {
		this.notaSeptiembre = notaSeptiembre;
	}
	
}
