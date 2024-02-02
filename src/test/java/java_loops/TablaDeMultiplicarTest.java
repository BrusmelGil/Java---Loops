package java_loops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class TablaDeMultiplicarTest {

    @Test
    public void testTablaDeMultiplicar() {


        ByteArrayOutputStream imprimir = new ByteArrayOutputStream();
        System.setOut(new PrintStream(imprimir));

        TablaDeMultiplicar.main(new String[]{});
        
        assertEquals("5 x 1 = 5 \n5 x 2 = 10 \n5 x 3 = 15 \n5 x 4 = 20 \n5 x 5 = 25 \n5 x 6 = 30 \n5 x 7 = 35 \n5 x 8 = 40 \n5 x 9 = 45 \n5 x 10 = 50 \n", imprimir.toString());
    }
    
    }


