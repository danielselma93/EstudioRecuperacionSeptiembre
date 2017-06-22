package Vista;
import java.awt.Component;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import Controlador.ControladorConsultas;
import Modelo.Usuario;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Controlador.ControladorVentanaTabla;

public class VentanaDeTabla {

	public JFrame frame;
	private JTable table;
	private JButton btnContinuar;


	public VentanaDeTabla() {
		initialize();
	}


	private void initialize() {
		ArrayList <Usuario>al;
		ControladorVentanaTabla cvt = new ControladorVentanaTabla();
		ControladorConsultas cc = new ControladorConsultas();
		DefaultTableModel dtm = new DefaultTableModel();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		JLabel lblHolaTabla = new JLabel("Hola tabla");
		lblHolaTabla.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblHolaTabla.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblHolaTabla);
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setActionCommand("continuar");
		frame.getContentPane().add(btnContinuar);
		al=cc.rellenaTabla();
		//for (int i=0;i<al.size();i++){
			
		//}
		cvt.goTo(btnContinuar, frame);
	}

}
