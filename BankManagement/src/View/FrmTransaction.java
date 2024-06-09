import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioTransaccion extends JFrame {
    private JTextField txtMonto;
    private JTextField txtCuentaOrigen;
    private JTextField txtCuentaDestino;
    private JButton btnCrearTransaccion;

    public FormularioTransaccion() {
        setLayout(new FlowLayout());

        JLabel lblMonto = new JLabel("Monto:");
        add(lblMonto);
        txtMonto = new JTextField(10);
        add(txtMonto);

        JLabel lblCuentaOrigen = new JLabel("Cuenta Origen:");
        add(lblCuentaOrigen);
        txtCuentaOrigen = new JTextField(10);
        add(txtCuentaOrigen);

        JLabel lblCuentaDestino = new JLabel("Cuenta Destino:");
        add(lblCuentaDestino);
        txtCuentaDestino = new JTextField(10);
        add(txtCuentaDestino);

        btnCrearTransaccion = new JButton("Crear Transacción");
        add(btnCrearTransaccion);

        btnCrearTransaccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double monto = Double.parseDouble(txtMonto.getText());
                String cuentaOrigen = txtCuentaOrigen.getText();
                String cuentaDestino = txtCuentaDestino.getText();

                Transaccion transaccion;
                if (cuentaDestino.isEmpty()) {
                    transaccion = new Transaccion(monto, cuentaOrigen);
                } else {
                    transaccion = new Transaccion(monto, cuentaOrigen, cuentaDestino);
                }

                // Aquí puedes hacer algo con la transacción creada
                System.out.println("Transacción creada: " + transaccion.getMonto() + " desde " + transaccion.getCuentaOrigen() + " a " + transaccion.getCuentaDestino());
            }
        });

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FormularioTransaccion();
    }
}
