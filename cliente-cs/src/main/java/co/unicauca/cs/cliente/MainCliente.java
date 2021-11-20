/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.cs.cliente;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainCliente
{
    public static void main(String[] args)
    {
        try {
            Cliente cli = new Cliente(); //Se crea el cliente
            
            System.out.println("Iniciando cliente\n");
            cli.startClient(); //Se inicia el cliente
        } catch (IOException ex) {
            Logger.getLogger(MainCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}