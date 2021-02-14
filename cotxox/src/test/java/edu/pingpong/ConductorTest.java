package edu.pingpong;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import edu.pingpong.Carrera;
import org.junit.Before;
import org.junit.Test;

public class ConductorTest {

    Conductor conductor = new Conductor("");

    @Before
    public void setUpCarrera(){
        Conductor conductor;
        conductor = new Conductor();
    }

    @Test
    public void getNombreConductorTest(){
        conductor.setNombre("Pablo");
        assertEquals("Pablo", conductor.getNombre());
    }
    @Test
    public void getModeloTest(){
        conductor.setModelo("Seat");
        assertEquals("Seat", conductor.getModelo());
    }
    @Test
    public void getMatriculaTest(){
        conductor.setMatricula("1287478127893789123");
        assertEquals("1287478127893789123", conductor.getMatricula());
    }
    @Test
    public void calcularValoracionMediaTest(){
        conductor.setValoracion((byte) 5);
        assertEquals(5d, conductor.calcularValoracionMedia(), 0.1);
        conductor.setValoracion((byte) 0);
        assertEquals(2.5, conductor.calcularValoracionMedia(), 0.1);
    }

}


