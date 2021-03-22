/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redouan.ejercicio;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import redouan.programa.MiPanel;

/**
 *
 * @author redu2
 */
public class TestEjercicios {

    public static void main(String[] args) {

        // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Aplicacion");

        //Establecemos los limites de la ventana y el tamaño fijo
        ventanaPrincipal.setSize(600, 600);
        
        // Establecemos que no se pueda modificar el tamaño de la ventana
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);

        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        // Acción por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        // Añadimos los paneles en cada posición del BorderLayout
        // Añadir panel amarillo en la posición superior (NORTH)
        //Cambiamos el color a los paneles
        ventanaPrincipal.add(new MiPanel(Color.PINK), BorderLayout.NORTH);

        // Añadir panel rojo en la posición inferior (SOUTH)
        //Cambiamos el color a los paneles
        ventanaPrincipal.add(new MiPanel(Color.MAGENTA), BorderLayout.SOUTH);
        // Añadir panel gris en la posición central (CENTER)
        //Cambiamos el color a los paneles
        ventanaPrincipal.add(new MiPanel(Color.WHITE), BorderLayout.CENTER);

        // Añadir panel verde en la posición izquierda (WEST)
        //Cambiamos el color a los paneles
        ventanaPrincipal.add(new MiPanel(Color.BLUE), BorderLayout.WEST);

        // Añadir panel cián en la posición derecha (EAST)
        //Cambiamos el color a los paneles
        ventanaPrincipal.add(new MiPanel(Color.LIGHT_GRAY), BorderLayout.EAST);
        
        //ME FALTA EL PUNTO D ?????
    }
}
