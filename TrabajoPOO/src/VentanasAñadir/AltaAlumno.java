package VentanasAñadir;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.beans.PropertyVetoException;

import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Clases.Alumno;
import VentanasVarias.Inicio;

import javax.swing.border.LineBorder;

public class AltaAlumno extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	
	//Atributos
	Inicio padre;
	
	private JTextField textFieldDNI;
	private JTextField textFieldNombre;
	private JTextField textFieldNumeroTelefono;
	private JTextField textFieldApellido1;
	private JTextField textFieldApellido2;
	
		//Chivatos
	Boolean FieldDniClicked = false;
	Boolean FieldNombreClicked = false;
	Boolean FieldNumeroTelefonoClicked = false;
	Boolean FieldApellido1Clicked = false;
	Boolean FieldApellido2Clicked = false;
	

	//Contructores
	public AltaAlumno() {
		setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setTitle("Dar de alta a un Alumno");
		QuitarBarraTitulo();
		setBounds(100, 100, 379, 331);
		try {
			setMaximum(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JLabel lblNombre = new JLabel("Nombre:");
		
		JLabel lblDni = new JLabel("DNI:");
		
		JLabel lblNumeroDeTelfono = new JLabel("Numero de tel\u00E9fono (m\u00F3vil):");
		
		JLabel lblPrimerApellido = new JLabel("Primer apellido:");
		
		JLabel lblSegundoApellido = new JLabel("Segundo apellido:");
		
		JLabel lblDarDeAlta = new JLabel("Dar de alta a un Alumno");
		lblDarDeAlta.setHorizontalAlignment(SwingConstants.CENTER);
		lblDarDeAlta.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		textFieldDNI = new JTextField();
		
		textFieldDNI.addKeyListener(new KeyAdapter()
		{
		   public void keyTyped(KeyEvent e)
		   {
		      char caracter = e.getKeyChar();

		      // Verificar si la tecla pulsada no es un digito
		      if(((caracter < '0') ||
		         (caracter > '9')) &&
		         (caracter != '\b' /*corresponde a BACK_SPACE*/))
		      {
		         e.consume();  // ignorar el evento de teclado
		      }
		   }
		});
		
		textFieldDNI.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!FieldDniClicked) {
					textFieldDNI.setText("");
					textFieldDNI.setForeground(Color.black);
					FieldDniClicked = true;
				}
			}
		});
		textFieldDNI.setForeground(Color.GRAY);
		textFieldDNI.setText("DNI sin letra...");
		textFieldDNI.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!FieldNombreClicked) {
					textFieldNombre.setText("");
					textFieldNombre.setForeground(Color.black);
					FieldNombreClicked = true;
				}
			}
		});
		textFieldNombre.setForeground(Color.GRAY);
		textFieldNombre.setText("Nombre...");
		textFieldNombre.setColumns(10);
		
		textFieldNumeroTelefono = new JTextField();
		textFieldNumeroTelefono.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!FieldNumeroTelefonoClicked) {
					textFieldNumeroTelefono.setText("");
					textFieldNumeroTelefono.setForeground(Color.black);
					FieldNumeroTelefonoClicked = true;
				}
			}
		});
		textFieldNumeroTelefono.setForeground(Color.GRAY);
		textFieldNumeroTelefono.setText("N\u00FAmero de tel\u00E9fono fijo o m\u00F3vil...");
		textFieldNumeroTelefono.setColumns(10);
		textFieldNumeroTelefono.addKeyListener(new KeyAdapter()
		{
		   public void keyTyped(KeyEvent e)
		   {
		      char caracter = e.getKeyChar();

		      // Verificar si la tecla pulsada no es un digito
		      if(((caracter < '0') ||
		         (caracter > '9')) &&
		         (caracter != '\b' /*corresponde a BACK_SPACE*/))
		      {
		         e.consume();  // ignorar el evento de teclado
		      }
		   }
		});
		textFieldApellido1 = new JTextField();
		textFieldApellido1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!FieldApellido1Clicked) {
					textFieldApellido1.setText("");
					textFieldApellido1.setForeground(Color.black);
					FieldApellido1Clicked = true;
				}
			}
		});
		textFieldApellido1.setForeground(Color.GRAY);
		textFieldApellido1.setText("Primer apellido...");
		textFieldApellido1.setColumns(10);
		
		textFieldApellido2 = new JTextField();
		textFieldApellido2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!FieldApellido2Clicked) {
					textFieldApellido2.setText("");
					textFieldApellido2.setForeground(Color.black);
					FieldApellido2Clicked = true;
				}
			}
		});
		textFieldApellido2.setForeground(Color.GRAY);
		textFieldApellido2.setText("Segundo apellido...");
		textFieldApellido2.setColumns(10);
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblSegundoApellido, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
						.addComponent(lblPrimerApellido, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblDni, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
						.addComponent(lblNumeroDeTelfono, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldNombre, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
						.addComponent(textFieldNumeroTelefono, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
						.addComponent(textFieldApellido2, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
						.addComponent(textFieldApellido1, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textFieldDNI, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(5))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(83)
					.addComponent(lblDarDeAlta, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
					.addGap(87))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDarDeAlta)
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldDNI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDni))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldApellido1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPrimerApellido))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldApellido2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSegundoApellido))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldNumeroTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumeroDeTelfono))
					.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
		);
		
		JButton btnCancelar = new JButton("Cancelar");
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alumno añadirAlumno;
				try {
					if(ValidarAlumno()) {
						añadirAlumno = new Alumno(textFieldNombre.getText(),textFieldApellido1.getText(),textFieldApellido2.getText(),Integer.parseInt(textFieldDNI.getText()), Integer.parseInt(textFieldNumeroTelefono.getText()));
						padre.alumnos.add(añadirAlumno);
						JOptionPane.showMessageDialog(null, "El alumno ha sido añadido con éxito", "Alumno añadido", JOptionPane.INFORMATION_MESSAGE);
					}
					dispose();
				}
				catch(Exception t) {
					JOptionPane.showMessageDialog(null, "Ha habido un error al añadir el alumno. Consulte el Log para más detalles.", "Error", JOptionPane.ERROR_MESSAGE);
					dispose();
				}
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(182, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnAceptar)))
		);
		panel.setLayout(gl_panel);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		getContentPane().setLayout(groupLayout);

	}
	
	
	
	
	
	//Métodos
	private void QuitarBarraTitulo()
	{
		JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
		
		Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
		Barra.setSize(0,0);
		Barra.setPreferredSize(new Dimension(0,0));
		repaint();
	}
	
	private Boolean ValidarAlumno() {
		
		if(textFieldDNI.getText() == "" || textFieldDNI.getText() == "DNI sin letra...") {
			JOptionPane.showMessageDialog(null, "El campo 'DNI' está sin rellenar", "Error de campo", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		
		else if(textFieldNombre.getText() == "" || textFieldNombre.getText() == "Nombre...") {
			JOptionPane.showMessageDialog(null, "El campo 'Nombre' está sin rellenar", "Error de campo", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		
		else if(textFieldNumeroTelefono.getText() == "" || textFieldNumeroTelefono.getText() == "Número de teléfono fijo o móvil...") {
			JOptionPane.showMessageDialog(null, "El campo 'Numero de teléfono' está sin rellenar", "Error de campo", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		
		else if(textFieldApellido1.getText() == "" || textFieldApellido1.getText() == "Primer apellido...") {
			JOptionPane.showMessageDialog(null, "El campo 'Primer Apellido' está sin rellenar", "Error de campo", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		
		else if(textFieldApellido2.getText() == "" || textFieldApellido2.getText() == "Segundo apellido...") {
			JOptionPane.showMessageDialog(null, "El campo 'Segundo Apellido' está sin rellenar", "Error de campo", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		
		else
			return true;
	}
	
	//Getters & Setters
	public Inicio getPadre() {
		return padre;
	}

	public void setPadre(Inicio padre) {
		this.padre = padre;
	}
}
