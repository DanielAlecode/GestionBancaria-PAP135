/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;
import java.io.*;
import java.util.*;

/**
 *
 * @author danie
 */
public class ModelUsuarios {
    
      private String filePath = "/usuarios.txt";

    

    public  boolean createUser(int idUsuario, String nombre, String apellido, String dui, String usuario, String pwd, String Url) {
        try (FileWriter fw = new FileWriter(Url+filePath, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(idUsuario + "," + nombre + "," + apellido + "," + dui + "," + usuario + "," + pwd );
            return true; 
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return false; 
        }
    }

    public List<String[]> readUsers(String Url) {
        List<String[]> users = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                users.add(line.split(","));
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return users;
    }
    
     public String[] login(String usuario, String pwd, String Url) {
        try (BufferedReader br = new BufferedReader(new FileReader(Url + filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] userDetails = line.split(",");
                if (userDetails[4].equals(usuario) && userDetails[5].equals(pwd)) {
                    return userDetails; // Retorna los datos del usuario si las credenciales coinciden
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return null; 
    }
}
