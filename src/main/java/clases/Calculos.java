package clases;

import java.util.ArrayList;
import java.util.List;

public class Calculos {

    public Integer sumar(ArrayList<Integer> numeros){
        Integer total = 0;

        for (Integer numero : numeros) {
            total = total + numero;
        }
        return total;
    }
}
