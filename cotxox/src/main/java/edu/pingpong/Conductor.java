package edu.pingpong;

import java.util.ArrayList;


public class Conductor {
    private String nombre ="";
    private String modelo = "";
    private String matricula = "";
    private double valoracionMedia = 0d;
    private boolean ocupado = false;
    private ArrayList <Byte> valoraciones = new ArrayList<>();


    public Conductor(){

    }

    public Conductor(String nombre){
        this.nombre = nombre;

    }

    public String getNombre() {

        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValoracion() {
        return valoracionMedia;
    }

    public int getNumeroValoraciones() {
        return this.valoraciones.size();
    }

    public void setValoracion(byte valoracion) {
        this.valoraciones.add(valoracion);
        this.calcularValoracionMedia();
    }

    public double calcularValoracionMedia(){
        this.valoracionMedia = this.valoraciones.stream().mapToDouble(v -> v).average().orElse(0.0);
        return this.valoracionMedia;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isOcupado() {
        return ocupado;
    }










}