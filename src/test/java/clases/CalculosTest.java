package clases;
import clases.Calculos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class CalculosTest {
    ArrayList<Integer> numeros = new ArrayList<>();
    Calculos calculosInstance;

    @BeforeEach
    void setup(){
        calculosInstance = new Calculos();
    }

    @DisplayName("Suma simple. Debe ser exitoso")
    @Test
    public void sumar_shouldsucceed(){
        numeros.add(1);
        numeros.add(2);
        numeros.add(5);
        numeros.add(10);
        numeros.add(45);

        Integer expected = 63;

        Integer resultado = calculosInstance.sumar(numeros);

        Assertions.assertEquals(expected, resultado);
    }
}
