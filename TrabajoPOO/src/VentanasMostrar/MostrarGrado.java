package VentanasMostrar;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

import Clases.Asignatura;
import Clases.Curso;
import Clases.Semestre;
import VentanasVarias.Inicio;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollBar;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Scrollbar;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.ScrollPaneConstants;

public class MostrarGrado extends JInternalFrame {

	//Atributos
	public Inicio padre;
	JTextArea textArea;
	//Contructores
	public MostrarGrado() {
		setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setBounds(100, 100, 450, 300);
		QuitarBarraTitulo();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
		);
		getContentPane().setLayout(groupLayout);
		
	}
	
	//Metodos
	public void MostrarInfo() {
		String contenido = "";
		try {
			for(Curso c: padre.grado.getCursos()) {
				contenido += "\n >Curso " + c.getNum();
				for(Semestre s: c.getSemestres()) {
					contenido += "\n   *Semestre " + s.getNum();
					for(Asignatura a: s.getAsignaturas()) {
						contenido += "\n      +" + a.getNombre();
						contenido += "\n        -Tipo: " + a.getTipo();
						contenido += "\n        -Tipo: " + a.getCreditos() + "\n";
					
					}
					contenido += "\n";
				}
				contenido += "\n";
			}
		
			textArea.setText(contenido);
		}
		catch(Exception t) {
			JOptionPane.showMessageDialog(null, "Para mostrar el grado primero ha de ser cargado. Si tras cargar el grado el problema persiste, por favor, consulte el log para más detalles", "Error Mostrar Grado", JOptionPane.ERROR_MESSAGE);
		}
		return;
	}
	
	private void QuitarBarraTitulo()
	{
		JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
		
		Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
		Barra.setSize(0,0);
		Barra.setPreferredSize(new Dimension(0,0));
		repaint();
	}
}
