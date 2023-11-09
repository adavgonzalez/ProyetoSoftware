/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectosoftware;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class ProyectoSoftware {

    
    public static void main(String[] args) {
        
        Inicio a = new Inicio();
        Iniciar_Sesion b = new Iniciar_Sesion();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        
        Timer timer = new Timer();

        // Creamos una tarea para el temporizador
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                
                a.setVisible(false);
                b.setVisible(true);
                b.setLocationRelativeTo(null);
            }
        };
        timer.schedule(task, 3000);
    }
    
}
