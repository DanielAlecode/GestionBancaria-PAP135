/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.File;

/**
 *
 * @author danie
 */
public class BankManagement {

    /**
     * @param args the command line arguments
     */
   
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        FrmConfiguracion frmConf = new FrmConfiguracion(); 
        FrmLogin login = new FrmLogin(); 
        File archivoConfig = new File("ConfigPath.Dat");
        if(archivoConfig.exists() && !archivoConfig.isDirectory()){
            login.show(); 
        }else{
            frmConf.show();
        }
    }
    
}
