/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;
import java.io.*;
import java.net.*;
import java.util.Scanner;


public class Cliente {
     public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un mensaje: ");
        String mensaje = sc.nextLine();

        try (Socket socket = new Socket("127.0.0.1", 5000)) { // Usa localhost si es la misma máquina
            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
            
            salida.println(mensaje);
            String respuesta = entrada.readLine();
            
            System.out.println("Respuesta del servidor: " + respuesta);
        }
     }
}
