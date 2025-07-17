/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;
import java.io.*;
import java.net.*;


public class Sevidor {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Servidor listo en el puerto 5000...");

        while (true) {
            try (Socket cliente = serverSocket.accept()) {
                BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);
                
                String mensaje = entrada.readLine();
                System.out.println("Recibido: " + mensaje);
                
                salida.println("Respuesta: " + mensaje);
            }
        }
    }

}
