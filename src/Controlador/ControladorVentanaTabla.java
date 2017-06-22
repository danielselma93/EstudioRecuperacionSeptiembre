package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import Vista.VentanaSiguiente;

public class ControladorVentanaTabla {

	public ControladorVentanaTabla() {
		// TODO Auto-generated constructor stub
	}
	public void goTo(JButton btnContinuar, JFrame frame){
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				VentanaSiguiente window = new VentanaSiguiente();
				window.frame.setVisible(true);
			}
		});
	}
}
