package Model;

import Controller.Transaccion;
import java.io.*;
import java.util.*;

public class ModelTransaccion {
    private final String filePath = "/transacciones.txt";

    public boolean createTransaction(double monto, String cuentaOrigen, String cuentaDestino, String Url) {
        try (FileWriter fw = new FileWriter(Url + filePath, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(monto + "," + cuentaOrigen + "," + cuentaDestino);
            return true;
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return false;
        }
    }

    public List<Transaccion> readTransactions(String Url) {
        final List<Transaccion> transactions = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Url + filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                double monto = Double.parseDouble(parts[0]);
                String cuentaOrigen = parts[1];
                String cuentaDestino = parts[2];
                transactions.add(new Transaccion(monto, cuentaOrigen, cuentaDestino));
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return transactions;
    }

    public static boolean registrarTransaccion(String transaccion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarTransaccion'");
    }

    public String[] obtenerHistorialTransacciones() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerHistorialTransacciones'");
    }
}
