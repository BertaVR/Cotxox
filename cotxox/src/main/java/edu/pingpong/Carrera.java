package edu.pingpong;
import edu.pingpong.Tarifa;
public class Carrera {
    String tarjetaCredito = "";
    String origen = "";
    String destino = "";
    double distancia = 0d;
    int tiempoEsperado = 0;
    int tiempoCarrera = 0;
    double costeTotal = 0d;
    int propina = 0;

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }


    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getTiempoEsperado() {
        return tiempoEsperado;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public double getCosteTotal() {
        return costeTotal;
    }

    public void setCosteTotal(double costeTotal) {
        this.costeTotal = costeTotal;
    }

    public int getPropina() {
        return propina;
    }

    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }
    public String getOrigen() {
        return origen;
    }
    public String getDestino() {
        return destino;
    }
    public double getCosteEsperado(){
        return Tarifa.getCosteTotalEsperado(this);
    }
}
