/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Serializer;

/**
 *
 * @author danie
 */
public class ControllerPath {
    public static String pathName; // Almacena el nombre del archivo
    public static String path;     // Almacena la ruta del archivo

    public static String getPathName() {
        return pathName;
    }

    public static void setPathName(String pathName) {
        ControllerPath.pathName = pathName;
    }

    public static String getPath() {
        return path;
    }

    public static void setPath(String path) {
        ControllerPath.path = path;
    }

    // Método para serializar usando los valores almacenados
    public static boolean serializar() {
        return Serializer.serializarObjeto(path, pathName);
    }

    // Método para deserializar usando los valores almacenados y un tipo de clase específico
    public static <T> T deserializar(Class<T> cls) {
        return Serializer.deserializarObjeto(pathName, cls);
    }
}
