package Vista;

import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

import Controlador.ControladorConsultas;
import Modelo.Usuario;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Controlador.ControladorVentanaSiguiente;
public class VentanaSiguiente {

	public JFrame frame;

	public VentanaSiguiente() {
		initialize();
	}

	private void initialize() {
		ControladorConsultas cc = new ControladorConsultas();
		ControladorVentanaSiguiente cvs = new ControladorVentanaSiguiente();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane);
		ArrayList<Usuario>al;
		DefaultListModel dlm = new DefaultListModel();
		al=cc.rellenaLista();
		for(int i=0;i<al.size();i++){
			dlm.addElement(al.get(i).getNombre());
			dlm.addElement(al.get(i).getApellido());
			dlm.addElement(al.get(i).getEdad());
		}
		
		JList list = new JList(dlm);
		scrollPane.setViewportView(list);
		
		JButton btnSiguiente = new JButton("Siguiente");
		
		frame.getContentPane().add(btnSiguiente);
		
		JButton btnVolver = new JButton("Volver");
	
		frame.getContentPane().add(btnVolver);
		cvs.backTo(btnVolver, frame);
		cvs.goTo(btnSiguiente, frame);
	}

}
