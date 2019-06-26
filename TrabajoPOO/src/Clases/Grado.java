package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Grado{
	
	//Atributos
	String nombre;
	ArrayList<Curso> cursos;
	
	//Constructores
	public Grado() {
		cursos = new ArrayList<Curso>();
		
	}
	
	
	
	//Métodos
	public void LeerGrado(String grado) {
		String buffer;
		File archivo = new File("files\\"+grado+".txt");
		FileReader read;
		BufferedReader buff;
		try {
			Asignatura asgn;
			
			read = new FileReader(archivo);
			buff = new BufferedReader(read);
			
			try {
				int c = 0, s = 0;
				buffer = buff.readLine();
				while(buffer!=null){
					
					if(buffer.startsWith("*")){
						c++; s=0;
						cursos.add(new Curso(c));
					}
					else if(buffer.startsWith("-")) {
						s++;
						getCursos().get(c-1).getSemestres().add(new Semestre(s));					
					}
					else if(buffer.startsWith("+")) {
						asgn = new Asignatura();
						asgn.LeerAsignatra(buffer);
						getCursos().get(c-1).getSemestres().get(s-1).getAsignaturas().add(asgn);
					}
					else {
						asgn = new Asignatura();
						asgn.LeerAsignatra(buffer);
						getCursos().get(c-1).getSemestres().get(s-1).getAsignaturas().add(asgn);
					}
					buffer = buff.readLine();
				}
				
			}catch(Exception t) {
				
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No se ha podido cargar el archivo DatosGrado. Por favor consulte el log para más detalles.", "Error", JOptionPane.ERROR_MESSAGE);
		}
			
		return;
	}
	
	//Getters & Setters
	public Grado(String nombre) {
		this.nombre = nombre;
		cursos = new ArrayList<Curso>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
}
