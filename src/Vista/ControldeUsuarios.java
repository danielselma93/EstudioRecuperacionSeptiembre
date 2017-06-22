package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Controlador.ControladorUsuarios;

public class ControldeUsuarios {

	public JFrame frame;
	private String nombre, apellido;
	private int edad;
	private JTextField textNombre;
	private JTextField textApellido;
	private int [] rangoEdades = {18,19,20,21,22,23,24,25,26,27,28,29,30};
	private JComboBox comboBox;
	private JButton btnInsertarDatos;
	
	public ControldeUsuarios() {
		initialize();
	}

	
	private void initialize() {
		ControladorUsuarios cu = new ControladorUsuarios();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel("Nombre");
		frame.getContentPane().add(lblNewLabel);
		
		textNombre = new JTextField();
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
	 	JLabel lblNewLabel_1 = new JLabel("Apellido");
		frame.getContentPane().add(lblNewLabel_1);
		
		textApellido = new JTextField();
		frame.getContentPane().add(textApellido);
		textApellido.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Edad");
		frame.getContentPane().add(lblNewLabel_2);
		
		comboBox = new JComboBox();
		frame.getContentPane().add(comboBox);
		
		btnInsertarDatos = new JButton("Insertar datos");
	
		
		frame.getContentPane().add(btnInsertarDatos);
		for(int i=0;i<this.rangoEdades.length;i++){
			comboBox.addItem(rangoEdades[i]);
		}
		
		cu.insertarLosDatos(btnInsertarDatos, textApellido, textNombre, comboBox, rangoEdades);
	}

}
