/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

import java.util.Objects;

/**
 *
 * @author acomesanavila
 */
public class Libro implements Comparable{

    private String nome, autor;
    private int precio, unidades;

    public Libro() {
    }

    public Libro(String nome, String autor, int precio, int unidades) {
        this.nome = nome;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libro{" + "nome=" + nome + ", autor=" + autor + ", precio=" + precio + ", unidades=" + unidades + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean aux = false;
        if (this == obj) {
            aux = true;
        }
        if (obj == null) {
            aux = false;
        }
        if (getClass() != obj.getClass()) {
            aux = false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            aux = false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            aux = false;
        }
        return aux;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
