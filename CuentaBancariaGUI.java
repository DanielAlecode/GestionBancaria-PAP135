package Controller;

import javax.swing.*;
import java.awt.event.*;

public class CuentaBancariaGUI extends JFrame {
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNumeroCuenta, txtTitular, txtMonto, txtCuentaDestino;
    private JLabel lblNumeroCuenta, lblTitular, lblSaldo, lblMonto, lblCuentaDestino;
    private JButton btnDepositar, btnRetirar, btnTransferir;
    private JTextArea txtAreaSalida;

    // Constructor
    public CuentaBancariaGUI() {
        setTitle("Cuenta Bancaria");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        lblNumeroCuenta = new JLabel("Número de Cuenta:");
        txtNumeroCuenta = new JTextField(20);
        lblTitular = new JLabel("Titular:");
        txtTitular = new JTextField(20);
        lblSaldo = new JLabel("Saldo:");
        txtAreaSalida = new JTextArea(5, 15);
        txtAreaSalida.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtAreaSalida);
        lblMonto = new JLabel("Monto:");
        txtMonto = new JTextField(10);
        lblCuentaDestino = new JLabel("Cuenta Destino:");
        txtCuentaDestino = new JTextField(20);
        btnDepositar = new JButton("Depositar");
        btnRetirar = new JButton("Retirar");
        btnTransferir = new JButton("Transferir");

        // Panel
        JPanel panel = new JPanel();
        panel.add(lblNumeroCuenta);
        panel.add(txtNumeroCuenta);
        panel.add(lblTitular);
        panel.add(txtTitular);
        panel.add(lblSaldo);
        panel.add(scrollPane);
        panel.add(lblMonto);
        panel.add(txtMonto);
        panel.add(lblCuentaDestino);
        panel.add(txtCuentaDestino);
        panel.add(btnDepositar);
        panel.add(btnRetirar);
        panel.add(btnTransferir);


        btnDepositar.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                depositar();
            }
        });

        btnRetirar.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                retirar();
            }
        });

        btnTransferir.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                transferir();
            }
        });


        add(panel);
        setVisible(true);
    }


    private void depositar() {
        double monto = Double.parseDouble(txtMonto.getText());
        if (monto<1){
        txtAreaSalida.append("Cantidad invalidad del monto, ingrese otra cantidad");
        } else {
        txtAreaSalida.append("Depósito de " + monto + " realizado.\n");
        }
    }

    private void retirar() {
        double monto = Double.parseDouble(txtMonto.getText());
        if (monto<1) {
        txtAreaSalida.append("No se puede retirar cantidades menor a $1");
        }else {
        txtAreaSalida.append("Retiro de " + monto + " realizado.\n");
        }
    }

    private void transferir() {
        double monto = Double.parseDouble(txtMonto.getText());
        String cuentaDestino = txtCuentaDestino.getText();
        if (monto<1) {
        txtAreaSalida.append("No es posible una transferencia de menos de $1");
        } else {
        txtAreaSalida.append("Transferencia de " + monto + " a la cuenta " + cuentaDestino + " realizada.\n");
        }
    }

    public static void main(String[] args) {
        new CuentaBancariaGUI();
    }
}

