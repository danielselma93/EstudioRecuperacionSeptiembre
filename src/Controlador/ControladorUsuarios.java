package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import Controlador.ControladorConsultas;

public class ControladorUsuarios {

	public ControladorUsuarios() {
	}
	public void insertarLosDatos(JButton btnInsertarDatos, JTextField textApellido, JTextField textNombre, JComboBox comboBox, int [] rangoEdades){
	btnInsertarDatos.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ControladorConsultas cc= new ControladorConsultas();
			String nombre, apellido;
			int edad;
			nombre=textNombre.getText();
			apellido=textApellido.getText();
			edad=comboBox.getSelectedIndex();
			edad=rangoEdades[edad];
			cc.insertarDatos(nombre, apellido, edad);
		}
	});
	}
}
