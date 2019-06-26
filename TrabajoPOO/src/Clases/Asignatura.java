package Clases;

public class Asignatura {
	
	//Atributos
	String nombre, tipo;
	float creditos;
	
	
	//Constructores
	public Asignatura() {
		
		
	}
	
	//Métodos
	public void LeerAsignatra(String buff) {
		String[] separator = buff.split(";");
		this.setNombre(separator[0]);
		this.setCreditos(Float.parseFloat(separator[1]));
		this.setTipo(separator[2]);
		
		return;
	}
	
	//Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getCreditos() {
		return creditos;
	}

	public void setCreditos(float creditos) {
		this.creditos = creditos;
	}
}
