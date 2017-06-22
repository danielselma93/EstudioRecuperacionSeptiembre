package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
public class ControladorBorrarRegistros {

	public ControladorBorrarRegistros() {
		// TODO Auto-generated constructor stub
	}
	public void borrarRegistro(JTextField textFieldNombre, JButton btnBorrar){
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorConsultas cc = new ControladorConsultas();
				String campoClave="";
				campoClave=textFieldNombre.getText();
				cc.borrarRegistro(campoClave);
			}
		});
		
		
	}
	
}
