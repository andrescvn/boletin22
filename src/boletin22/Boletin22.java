/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Boletin22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos met= new Metodos();
        int op;
        do{
        op= Integer.parseInt(JOptionPane.showInputDialog("1) Engadir \n 2) Visualizar \n 3)Consultar \n4) Borrar\n 5)Modificar \n 6)Ordenar \n 7) Buscar \n 8)Leer fichero \n 9) Escribir fichero\n 10) Salir"));
        switch (op){
            case 1:
                met.engadir();
                break;
            case 2:
                met.visualizar();
                break;
            case 3:
            met.consultar();
            break;
            case 4:
                met.borrar();
                break;
            case 5:
                met.modificar();
                break;
            case 6:
                met.ordenar();
                break;
            case 7:
                met.buscarAutor();
                break;
            case 8:
                met.leerLibreria();
                break;
            case 9:
                met.escribirLibreria();
                break;
        }
        }while (op!=10);
                
        }
        
    }
    

