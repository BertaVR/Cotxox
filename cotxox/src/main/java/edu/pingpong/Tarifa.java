package edu.pingpong;

public class Tarifa {
    static final double COSTE_MILLA = 1.35;
    static final double COSTE_MINUTO = 0.35;
    static final double COSTE_MINIMO = 5d;
    static final byte PORCENTAJE_COMISION = 20;

    public Tarifa(){

    }
    static double getCosteDistancia(double distancia){
        return distancia * COSTE_MILLA;
    }
    static double getCosteTiempo(double minutos){
        return minutos * COSTE_MINUTO;
    }
    static double getCosteTotalEsperado(Carrera carrera){
        double costeEsperado = 0d;
        if((getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado()))> COSTE_MINIMO){
            costeEsperado = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
        }
        else{
            costeEsperado = COSTE_MINIMO;
        }
        return costeEsperado;
    }

}
