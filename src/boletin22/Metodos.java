/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;
import operacions.calculos;

/**
 *
 * @author acomesanavila
 */
public class Metodos {
    
    private ArrayList<Libro> libreria = new ArrayList();
        private Scanner scan;
    private PrintWriter escribir;
    
    public void engadir() {
        libreria.add(new Libro(calculos.pedirString(), calculos.pedirString(), calculos.pedirInt(), calculos.pedirInt()));
    }
    
    public void consultar() {
        String titulo = JOptionPane.showInputDialog("titulo?");
        for (int i = 0; i < libreria.size(); i++) {
            if (libreria.get(i).equals(titulo) == true) {
                libreria.get(i).toString();
            } else {
                System.out.println("No esta");
            }
        }
    }
    
    public void visualizar() {
        for (int i = 0; i < libreria.size(); i++) {
            System.out.println(libreria.get(i));
        }
    }
    
    public void borrar() {
        for (int i = 0; i < libreria.size(); i++) {
            if (libreria.get(i).getUnidades() == 0) {
                libreria.remove(i);
            }
        }
    }

    public void modificar() {
        String titulo = JOptionPane.showInputDialog("titulo libro");
        int precio = Integer.parseInt(JOptionPane.showInputDialog("precio nuevo"));
        for (int i = 0; i < libreria.size(); i++) {
            if (libreria.get(i).getNome().equals(titulo)) {
                libreria.get(i).setPrecio(precio);
            }
        }
    }

    public void buscarAutor() {
        String autor = JOptionPane.showInputDialog("autor");
        for (int i = 0; i < libreria.size(); i++) {
            if (libreria.get(i).getAutor().equals(autor)) {
                System.out.println(libreria.get(i));
            }
        }
    }

    public void ordenar() {
        Collections.sort(libreria);
    }
        public void leerLibreria(){
        String[]aux;
        libreria = new ArrayList <Libro>();
        try{
            scan = new Scanner(new File("libFich.txt"));
            while(scan.hasNextLine()){
                aux = scan.nextLine().split(",");
                Libro lib = new Libro(aux[0], aux[1], Integer.parseInt(aux[2]), Integer.parseInt(aux[3]));
                libreria.add(lib);
            }
        }catch(Exception ex){
            System.out.println("Error");
        }finally{
            scan.close();
        }
    }
    
    public void escribirLibreria(){
        try{
            escribir = new PrintWriter(new File("libFich.txt"));
            for(int i = 0; i<libreria.size(); i++){
                escribir.println(libreria.get(i).getNome()+","+libreria.get(i).getAutor()+","+libreria.get(i).getPrecio()+","+libreria.get(i).getUnidades());
            }
        }catch(Exception ex){
            System.out.println(ex + "Error");
        }finally{
            escribir.close();
        }
    }
}
