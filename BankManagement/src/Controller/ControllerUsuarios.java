/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import static Controller.ControllerPath.pathName;
import Model.ModelUsuarios; 
import Model.Serializer;
/**
 *
 * @author danie
 */
public class ControllerUsuarios {
    public static String idUsuario;
    public static String nombre;
    public static String apellido;
    public static String dui;
    public static String usuario;
    public static String pwd;
    public static String Url; 

    public static String getUrl() {
        return Url;
    }

    public static void setUrl(String Url) {
        ControllerUsuarios.Url = Url;
    }

    public static String getIdUsuario() {
        return idUsuario;
    }

    public static void setIdUsuario(String idUsuario) {
        ControllerUsuarios.idUsuario = idUsuario;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        ControllerUsuarios.nombre = nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        ControllerUsuarios.apellido = apellido;
    }

    public static String getDui() {
        return dui;
    }

    public static void setDui(String dui) {
        ControllerUsuarios.dui = dui;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        ControllerUsuarios.usuario = usuario;
    }

    public static String getPwd() {
        return pwd;
    }

    public static void setPwd(String pwd) {
        ControllerUsuarios.pwd = pwd;
    }

    
    public static boolean CrearUsuario(){
        Model.ModelUsuarios usuarioModel = new Model.ModelUsuarios(); 
        return usuarioModel.createUser(idUsuario, nombre, apellido, dui, usuario, pwd, Url);
    }
    
}
