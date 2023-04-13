package clases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OtraClaseTest {

    OtraClase otraClase;

    @BeforeEach
    public void setup(){
        otraClase = new OtraClase();
    }

    @DisplayName("Mandar un nombre valido. Debe retornar true")
    @Test
    public void esDeAR_nombrevalido_shouldReturnTrue(){
        Assertions.assertEquals(true, otraClase.esDeAR("Lupita"));
    }

    @DisplayName("Mandar un nombre invalido. Debe retornar false")
    @Test
    public void esDeAR_nombreInvalido_shouldReturnFalse(){
        Assertions.assertEquals(false, otraClase.esDeAR("Juan"));
    }

}
