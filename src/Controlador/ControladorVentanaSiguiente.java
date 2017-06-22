package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import Vista.ControldeUsuarios;
import Vista.VentanaDeTabla;

public class ControladorVentanaSiguiente {

	public ControladorVentanaSiguiente() {
		// TODO Auto-generated constructor stub
	}
	public void goTo(JButton btnSiguiente, JFrame frame){
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				ControldeUsuarios window = new ControldeUsuarios();
				window.frame.setVisible(true);
			}
		});
	}
	public void backTo(JButton btnVolver, JFrame frame){
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				VentanaDeTabla window = new VentanaDeTabla();
				window.frame.setVisible(true);
			}
		});
	
	}

}
