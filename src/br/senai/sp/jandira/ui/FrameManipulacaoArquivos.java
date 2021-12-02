package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.senai.sp.jandira.arquivo.Arquivo;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class FrameManipulacaoArquivos extends JFrame {

	private JPanel contentPane;


	public FrameManipulacaoArquivos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 381);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBox.light"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblManipulacaoArquivos = new JLabel("Manipula\u00E7\u00E3o de Arquivos");
		lblManipulacaoArquivos.setFont(new Font("Calibri", Font.BOLD, 20));
		lblManipulacaoArquivos.setBounds(20, 11, 236, 39);
		contentPane.add(lblManipulacaoArquivos);
		
		JLabel lblDigiteAqui = new JLabel("Digite aqui:");
		lblDigiteAqui.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblDigiteAqui.setBounds(20, 48, 97, 28);
		contentPane.add(lblDigiteAqui);
		
		JTextPane textPaneTexto = new JTextPane();
		textPaneTexto.setBounds(20, 85, 244, 165);
		contentPane.add(textPaneTexto);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setForeground(Color.BLACK);
		btnGravar.setBackground(Color.WHITE);
		btnGravar.setBounds(20, 282, 72, 23);
		contentPane.add(btnGravar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBackground(Color.WHITE);
		btnLimpar.setBounds(102, 282, 80, 23);
		contentPane.add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBackground(Color.WHITE);
		btnSair.setBounds(192, 282, 72, 23);
		contentPane.add(btnSair);
		
		btnGravar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Arquivo arquivo = new Arquivo();
				
				String caminho = "C:\\Users\\21276662\\Desktop\\Teste\\aula.txt";
				String texto = arquivo.ler(caminho) + textPaneTexto.getText();
						
				arquivo.escrever(caminho, texto);
				
				System.out.println("gravou");
				
			}
		});
			
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				textPaneTexto.setText("");
				
			}
		});
		
		btnSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
	}

}
