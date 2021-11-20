/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.cs.servidor;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//Clase principal que hará uso del servidor

public class MainServidor
{
    public static void main(String[] args)
    {
        Servidor serv;
        try {
            serv = new Servidor(); //Se crea el servidor
            System.out.println("Iniciando servidor\n");
            serv.startServer(); //Se inicia el servidor
        } catch (IOException ex) {
            Logger.getLogger(MainServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}