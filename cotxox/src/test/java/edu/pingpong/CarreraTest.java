package edu.pingpong;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import edu.pingpong.Carrera;
import org.junit.Before;
import org.junit.Test;
public class CarreraTest {
    Carrera carrera;
    String origen = "pinga";
    @Before
    public void setupCarrera(){
        this.carrera = new Carrera("32598328905238");
    }
     @Test
    public void tarjetaCreditoTest(){
         assertEquals("32598328905238", this.carrera.getTarjetaCredito());
     }
    @Test
    public void origenTest(){
        carrera.setOrigen("pinga");
        assertEquals("pinga", carrera.getOrigen());
    }
    @Test
    public void destinoTest(){
        carrera.setDestino("uwulandia");
        assertEquals("uwulandia", this.carrera.getDestino());
    }
    @Test
    public void distanciaTest(){
        carrera.setDistancia(5.0);
        assertEquals(5.0, this.carrera.getDistancia(), 0.1);
    }
    @Test
    public void tiempoEsperadoTest(){
        carrera.setTiempoEsperado(6);
        assertEquals(6, this.carrera.getTiempoEsperado());
    }
    @Test
    public void tiempoCarreratestTest(){
        carrera.setTiempoCarrera(7);
        assertEquals(7, this.carrera.getTiempoCarrera());
    }
    @Test
    public void costeTotalTest(){
        carrera.setCosteTotal(10.0);
        assertEquals(10.0, this.carrera.getCosteTotal(), 0.1);
    }

}
