package açai;

import javax.swing.JComboBox;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class Telaacaiteria {
	static double total = 0;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Açaiteria do Gabriel");
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JLabel lblTamanho = new JLabel("Tamanho:");
		lblTamanho.setBounds(30, 30, 100, 20);
		frame.add(lblTamanho);
		
		String[] tamanhos = {"P", "M", "G"};
		JComboBox<String> combo = new JComboBox<>(tamanhos);
		combo.setBounds(100, 30 , 60, 25);
		frame.add(combo);
		
		JButton btnCupacu = new JButton("Cupuaçu");
        btnCupacu.setBounds(30, 80, 120, 30);
        frame.add(btnCupacu);
        
        JButton btnAcai = new JButton("Açaí");
        btnAcai.setBounds(200, 80, 120, 30);
        frame.add(btnAcai);
        
        JLabel lblTotal = new JLabel("Total: R$ 0.00");
        lblTotal.setBounds(30, 150, 200, 30);
        frame.add(lblTotal);
        
        JButton btnFinalizar = new JButton("Finalizar Compra");
        btnFinalizar.setBounds(100, 200, 180, 35);
        frame.add(btnFinalizar);
        
        btnCupacu.addActionListener(e -> {
            String t = combo.getSelectedItem().toString();
            total += Cupacu.getPreco(t);
            lblTotal.setText("Total: R$ " + String.format("%.2f", total));
        });

        btnAcai.addActionListener(e -> {
            String t = combo.getSelectedItem().toString();
            total += Acai.getPreco(t);
            lblTotal.setText("Total: R$ " + String.format("%.2f", total));
        });
       
        btnFinalizar.addActionListener(e -> {

            JOptionPane.showMessageDialog(frame,
                    "Compra finalizada!\nTotal: R$ " + String.format("%.2f", total));

            total = 0;
            lblTotal.setText("Total: R$ 0.00");
        });

        frame.setVisible(true);

	}

}
