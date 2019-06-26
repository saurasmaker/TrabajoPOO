package VentanasVarias;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Grado;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ElegirGrado extends JDialog {

	private final JPanel contentPanel = new JPanel();

	//Atributos
	Inicio padre;
	
	//Constructores
	public ElegirGrado() {
		setBounds(100, 100, 327, 151);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JComboBox comboBoxGrados = new JComboBox();
		comboBoxGrados.setModel(new DefaultComboBoxModel(new String[] {"Ingenier\u00EDa Inform\u00E1tica", "Enfermer\u00EDa", "Medicina", "Arquitectura", "Bellas Artes"}));
		comboBoxGrados.setBounds(24, 28, 264, 22);
		contentPanel.add(comboBoxGrados);
		
		JLabel lblGrado = new JLabel("Grado:");
		lblGrado.setBounds(24, 11, 264, 14);
		contentPanel.add(lblGrado);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String gradoBuff = (String)comboBoxGrados.getSelectedItem();
						if(gradoBuff != null) {
							padre.grado = new Grado();
							padre.grado.LeerGrado(gradoBuff);
						}
						else
							JOptionPane.showMessageDialog(null, "Acción cancelada con éxito.", "Acción Cancelada", JOptionPane.INFORMATION_MESSAGE);
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	//Métodos
	
	//Getter & Setters
	
}
