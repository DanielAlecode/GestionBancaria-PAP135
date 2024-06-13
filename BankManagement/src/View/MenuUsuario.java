package View;


import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import Model.ModelTransaccion;

public class MenuUsuario extends JFrame {
    private ModelTransaccion modelTransaccion = new ModelTransaccion();

    public ModelTransaccion getModelTransaccion() {
        return modelTransaccion;
    }

    public void setModelTransaccion(ModelTransaccion modelTransaccion) {
        this.modelTransaccion = modelTransaccion;
    }

    /**
     * 
     */
    public MenuUsuario() {
        setTitle("Menú de Usuario");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        JButton btnClientes = new JButton("Gestión de Clientes");
        JButton btnCuentas = new JButton("Gestión de Cuentas");
        JButton btnTransacciones = new JButton("Registro de Transacciones");
        JButton btnHistorial = new JButton("Historial de Transacciones");
        JButton btnSalir = new JButton("Salir");

        btnClientes.addActionListener(e -> 
            JOptionPane.showMessageDialog(null, "Opción de gestión de clientes seleccionada.")
        );

        btnCuentas.addActionListener(e -> 
            JOptionPane.showMessageDialog(null, "Opción de gestión de cuentas seleccionada.")
        );

        btnTransacciones.addActionListener(e -> {
            new FormularioTransaccion(modelTransaccion);
        });

        btnHistorial.addActionListener(e -> extracted());

        btnSalir.addActionListener(e -> System.exit(0));

        panel.add(btnClientes);
        panel.add(btnCuentas);
        panel.add(btnTransacciones);
        panel.add(btnHistorial);
        panel.add(btnSalir);

        add(panel);
        setVisible(true);
    }

    @SuppressWarnings("static-access")
    private void extracted() {
        StringBuilder historial = new StringBuilder();
        for (String transaccion : modelTransaccion.obtenerHistorialTransacciones()) {
            historial.append(transaccion).append("\n");
        }
        JOptionPane.showMessageDialog(null, "Historial de Transacciones:\n" + historial.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MenuUsuario::new);
    }
}
