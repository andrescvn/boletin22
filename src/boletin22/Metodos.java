/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import operacions.calculos;

/**
 *
 * @author acomesanavila
 */
public class Metodos {
   ArrayList libreria = new ArrayList();
public void engadir(){
    libreria.add(new Libro(calculos.pedirString(),calculos.pedirString(),calculos.pedirInt(),calculos.pedirInt()));
}
public void consultar(){
    String titulo=JOptionPane.showInputDialog("titulo?");
    for(int i=0; i<libreria.size();i++)
        if(libreria.get(i).equals(titulo)==true)
            libreria.get(i).toString();
    else
            System.out.println("No esta");
}
public void visualizar(){
     for(int i=0; i<libreria.size();i++)
         System.out.println(libreria.get(i));
}
public void borrar(){
    for(int i=0; i<libreria.size();i++)
        if(libreria.get(i).get)
}
}
