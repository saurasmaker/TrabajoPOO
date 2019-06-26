package VentanasVarias;

import Clases.*;
import VentanasAñadir.AltaAlumno;
import VentanasModificar.ModificarAlumno;
import VentanasMostrar.MostrarGrado;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Inicio extends JFrame {

	//Atributos
	private JPanel contentPane;
	Inicio estaVentana = this;
	
	public ArrayList<Alumno> alumnos;
	public Grado grado;
	
	//Main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Contructor
	public Inicio() {
		setTitle("SISTEMA MATRICULACI\u00D3N EN INGENIER\u00CDA INFORM\u00C1TICA ");
		alumnos = new ArrayList<Alumno>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(100, 100, 733, 586);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		GroupLayout gl_desktopPane = new GroupLayout(desktopPane);
		gl_desktopPane.setHorizontalGroup(
			gl_desktopPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 745, Short.MAX_VALUE)
				.addGap(0, 745, Short.MAX_VALUE)
		);
		gl_desktopPane.setVerticalGroup(
			gl_desktopPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 377, Short.MAX_VALUE)
				.addGap(0, 377, Short.MAX_VALUE)
		);
		desktopPane.setLayout(gl_desktopPane);
		
		JPanel panelAlumnos = new JPanel();
		panelAlumnos.setBorder(new TitledBorder(null, "Alumnos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panelAsignaturas = new JPanel();
		panelAsignaturas.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Asignaturas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panelExpedientes = new JPanel();
		panelExpedientes.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Expedientes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblVentana = new JLabel("Ventana:");
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Listar", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JButton btnListarAlumnos = new JButton("Listar Alumnos");
		
		JButton btnMostrarGrado = new JButton("Mostrar Grado");
		btnMostrarGrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarGrado mostrarGrado = new MostrarGrado();
				mostrarGrado.padre = estaVentana;
				mostrarGrado.MostrarInfo();
				desktopPane.add(mostrarGrado);
				lblVentana.setText("Mostrar Grado: ");
				try {
					mostrarGrado.setMaximum(true);
				} catch (PropertyVetoException e1) {
					e1.printStackTrace();
				}
				mostrarGrado.setVisible(true);
			}
			
		});
		
		JButton btnListarExpedietnes = new JButton("Listar Expedientes");
		
		JButton button_3 = new JButton("Mostrar Expediente");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnListarAlumnos, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnMostrarGrado, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnListarExpedietnes, GroupLayout.PREFERRED_SIZE, 107, Short.MAX_VALUE)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 107, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(btnListarAlumnos)
					.addGap(6)
					.addComponent(btnMostrarGrado)
					.addGap(6)
					.addComponent(btnListarExpedietnes)
					.addGap(6)
					.addComponent(button_3)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JButton btnNewButton = new JButton("Guardar");
		
		JButton btnNuevoExpediente = new JButton("Nuevo Expediente");
		
		JButton btnModificarExpediente = new JButton("Modificar Expediente");
		
		JButton btnEliminarExpediente = new JButton("Eliminar Expediente");
		
		JButton btnMostrarExpediente = new JButton("Mostrar Expediente");
		GroupLayout gl_panelExpedientes = new GroupLayout(panelExpedientes);
		gl_panelExpedientes.setHorizontalGroup(
			gl_panelExpedientes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelExpedientes.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelExpedientes.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNuevoExpediente, GroupLayout.PREFERRED_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnModificarExpediente, GroupLayout.PREFERRED_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnEliminarExpediente, GroupLayout.PREFERRED_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnMostrarExpediente, GroupLayout.PREFERRED_SIZE, 107, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelExpedientes.setVerticalGroup(
			gl_panelExpedientes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelExpedientes.createSequentialGroup()
					.addComponent(btnNuevoExpediente)
					.addGap(6)
					.addComponent(btnModificarExpediente)
					.addGap(6)
					.addComponent(btnEliminarExpediente)
					.addGap(6)
					.addComponent(btnMostrarExpediente)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		panelExpedientes.setLayout(gl_panelExpedientes);
		
		JButton buttonAñadirAsignatura = new JButton("A\u00F1adir Asignatura");
		
		JButton btnModificarAsignatura = new JButton("Modificar Asignatura");
		
		JButton btnEliminarAsignatura = new JButton("Eliminar Asignatura");
		
		JButton btnMostrarAsignatura = new JButton("Mostrar Asignatura");
		GroupLayout gl_panelAsignaturas = new GroupLayout(panelAsignaturas);
		gl_panelAsignaturas.setHorizontalGroup(
			gl_panelAsignaturas.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelAsignaturas.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelAsignaturas.createParallelGroup(Alignment.LEADING)
						.addComponent(buttonAñadirAsignatura, GroupLayout.PREFERRED_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnModificarAsignatura, GroupLayout.PREFERRED_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnEliminarAsignatura, GroupLayout.PREFERRED_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnMostrarAsignatura, GroupLayout.PREFERRED_SIZE, 107, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelAsignaturas.setVerticalGroup(
			gl_panelAsignaturas.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAsignaturas.createSequentialGroup()
					.addComponent(buttonAñadirAsignatura)
					.addGap(6)
					.addComponent(btnModificarAsignatura)
					.addGap(6)
					.addComponent(btnEliminarAsignatura)
					.addGap(6)
					.addComponent(btnMostrarAsignatura)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		panelAsignaturas.setLayout(gl_panelAsignaturas);
		
		JButton btnAltaAlumno = new JButton("Alta Alumno");
		btnAltaAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AltaAlumno altaAlumno = new AltaAlumno();
				desktopPane.removeAll();
				altaAlumno.setPadre(estaVentana);
				desktopPane.add(altaAlumno);
				lblVentana.setText("Alta Alumno:");
				altaAlumno.show();
			}
		});
		
		JButton btnModificarAlumno = new JButton("Modificar Alumno");
		btnModificarAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModificarAlumno modificarAlumno = new ModificarAlumno();
				
				//Metodos busqueda
				int DNI;
				String nombre;
				
				desktopPane.removeAll();
				desktopPane.add(modificarAlumno);
				lblVentana.setText("Modificar Alumno: ");
				modificarAlumno.setaModificar(EncontrarAlumnoO(""));
				if(modificarAlumno.getaModificar() != null) {
					modificarAlumno.show();
				}
				else {
					JOptionPane.showMessageDialog(null, "No se ha encontrado ningún alumno con ese DNI", "Error de campo", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		JButton btnEliminaralumno = new JButton("Eliminar Alumno");
		
		JButton btnMostrarAlumno = new JButton("Mostrar Alumno");
		GroupLayout gl_panelAlumnos = new GroupLayout(panelAlumnos);
		gl_panelAlumnos.setHorizontalGroup(
			gl_panelAlumnos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAlumnos.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelAlumnos.createParallelGroup(Alignment.LEADING)
						.addComponent(btnMostrarAlumno, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnEliminaralumno, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnModificarAlumno, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnAltaAlumno, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelAlumnos.setVerticalGroup(
			gl_panelAlumnos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAlumnos.createSequentialGroup()
					.addComponent(btnAltaAlumno)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnModificarAlumno)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnEliminaralumno)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnMostrarAlumno)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		panelAlumnos.setLayout(gl_panelAlumnos);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnCargarGrado = new JButton("Cargar Grado");
		btnCargarGrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ElegirGrado elegirGrado = new ElegirGrado();
				elegirGrado.padre = estaVentana;
				elegirGrado.setVisible(true);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(panelAlumnos, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panelAsignaturas, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panelExpedientes, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblVentana, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE)))
					.addGap(10))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(480, Short.MAX_VALUE)
					.addComponent(btnCargarGrado)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(panelAlumnos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelAsignaturas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelExpedientes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblVentana)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton)
						.addComponent(btnCargarGrado))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		
		
	}
	
	
	//Metodos
	Alumno EncontrarAlumnoO(String dni) {	
		for(Alumno a: alumnos)
			if(Integer.toString(a.getDni()) == dni)
				return a;

		return null; 
	}
	
	int EncontrarAlumnoI(String dni) {
		for(int i = 0; i < alumnos.size(); i++)
			if(Integer.toString(alumnos.get(i).getDni()) == dni)
				return i;
		
		return -1;
	}
	
	Asignatura EncontrarAsignatura(String nombre) {
		for(Curso c: grado.getCursos())
			for(Semestre s: c.getSemestres())
				for(Asignatura a: s.getAsignaturas())
					if(a.getNombre() == nombre)
						return a;
		
		return null;
	}
	
	int[] EncontrarAsignaturaCoord(String nombre) {
		int[] coordenadas = {-1,-1,-1};
		
		for(int i = 0; i < grado.getCursos().size(); i++)
			for(int j = 0; j < grado.getCursos().get(i).getSemestres().size(); j++)
				for(int k = 0; k < grado.getCursos().get(i).getSemestres().get(j).getAsignaturas().size(); k++)
					if(grado.getCursos().get(i).getSemestres().get(j).getAsignaturas().get(k).getNombre() == nombre) {
						coordenadas[0] = i;
						coordenadas[1] = j;
						coordenadas[2] = k;
					}
		
		return coordenadas;
	}
}
