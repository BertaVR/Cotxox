package edu.pingpong;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TarifaTest {
    Tarifa tarifa;
    Carrera carrera;

    @Before
    public void setupCarrera(){
        this.carrera = new Carrera("32598328905238");
    }
    @Test
    public void getCosteDistanciaTest(){
        assertEquals(4.05,tarifa.getCosteDistancia(3d), 0.1);
    }
    @Test
    public void getCosteTiempoTest(){
        assertEquals(3.5,tarifa.getCosteTiempo(10d), 0.1);
    }
    @Test
    public void getCosteEstimadoTest(){
        double distancia = 7.75;
        int tiempoEsperadoMinutos = 10;
        carrera.setDistancia(distancia);
        carrera.setTiempoEsperado(tiempoEsperadoMinutos);
        assertEquals(13.9625, carrera.getCosteEsperado(), 0.1);
    }
    @Test
    public void getCosteEstimadoMenorque5Test(){
        double distancia = 1.3;
        int tiempoEsperadoMinutos = 3;
        carrera.setDistancia(distancia);
        carrera.setTiempoEsperado(tiempoEsperadoMinutos);
        assertEquals(5.0, carrera.getCosteEsperado(), 0.1);
    }
    @Test
    public void getCosteEstimado5Test(){
        double distancia = 1.3;
        int tiempoEsperadoMinutos = 3;
        carrera.setDistancia(distancia);
        carrera.setTiempoEsperado(tiempoEsperadoMinutos);
        assertEquals(5.0, carrera.getCosteEsperado(), 0.1);
    }

}
