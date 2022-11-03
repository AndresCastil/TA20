package com.TA20.TA20_mavenProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ej2 extends JFrame {

	private JPanel contentPane;

	public Ej2() {

		setTitle("Ventana con interacción Ej2");
		setBounds(900, 200, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		JLabel etiqueta = new JLabel("Has pulsado:");
		etiqueta.setBounds(50, 10, 200, 100);
		contentPane.add(etiqueta);
		JButton btn1 = new JButton("Boton 1");
		btn1.setBounds(200, 50, 89, 23);
		contentPane.add(btn1);
		JButton btn2 = new JButton("Boton 2");
		btn2.setBounds(300, 50, 89, 23);
		contentPane.add(btn2);

		ActionListener aL = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JButton boton = (JButton) e.getSource();
				etiqueta.setText("Has pulsado: " + boton.getText());
			}
		};

		btn1.addActionListener(aL);
		btn2.addActionListener(aL);
	}
}