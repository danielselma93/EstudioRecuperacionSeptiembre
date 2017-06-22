package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import Controlador.ControladorBorrarRegistros;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class BorrarRegistros {

	public JFrame frame;
	private JTextField textFieldNombre;
	private JButton btnBorrar;
	
	public BorrarRegistros() {
		initialize();
	}

	
	private void initialize() {
		ControladorBorrarRegistros cbr = new ControladorBorrarRegistros();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textFieldNombre = new JTextField();
		frame.getContentPane().add(textFieldNombre, BorderLayout.CENTER);
		textFieldNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Introduce nombre");
		frame.getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		btnBorrar = new JButton("Borrar!!");
		
		frame.getContentPane().add(btnBorrar, BorderLayout.SOUTH);
		cbr.borrarRegistro(textFieldNombre, btnBorrar);
	}

}
