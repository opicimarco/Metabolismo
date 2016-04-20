import java.util.*;
import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class Persona {
    
    private String nome;
    private String cognome;
    private float peso;
    private Date dataN;

    public Persona(String nome, String cognome, float peso, Date dataN) {
        this.nome = nome;
        this.cognome = cognome;
        this.peso = peso;
        this.dataN = dataN;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public float getPeso() {
        return peso;
    }

    public Date getDataN() {
        return dataN;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setDataN(Date dataN) {
        this.dataN = dataN;
    }
    
    
    
    
}
