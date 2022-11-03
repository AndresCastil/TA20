package com.TA20.TA20_mavenProject;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ej1 extends JFrame {

	private JPanel contentPane;

	public Ej1() {

		setTitle("Título de la ventana Ej1");
		setBounds(400, 200, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		JLabel etiqueta = new JLabel("Etiqueta");
		etiqueta.setBounds(60, 20, 200, 100);
		contentPane.add(etiqueta);

	}
}