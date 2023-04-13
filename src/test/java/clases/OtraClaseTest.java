package clases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// La clase debe tener el mismo nombre que la clase a probar y terminar con Test
public class OtraClaseTest {

    // Declarar objeto de la clase que vamos a probar
    OtraClase otraClase;

    // El metodo de setup se usa para inicializar el objeto de la clase. Debe ser anotado con @BeforeEach
    @BeforeEach
    public void setup(){
        otraClase = new OtraClase();
    }

    @DisplayName("Mandar un nombre valido. Debe retornar true")
    @Test
    public void esDeAR_nombrevalido_shouldReturnTrue(){
        //Ademas de assertEquals hay muchos mas metodos de asercion https://junit.org/junit4/javadoc/4.8/org/junit/Assert.html
        Assertions.assertEquals(true, otraClase.esDeAR("Lupita"));
    }

    @DisplayName("Mandar un nombre invalido. Debe retornar false")
    @Test
    public void esDeAR_nombreInvalido_shouldReturnFalse(){
        Assertions.assertEquals(false, otraClase.esDeAR("Juan"));
    }

}
