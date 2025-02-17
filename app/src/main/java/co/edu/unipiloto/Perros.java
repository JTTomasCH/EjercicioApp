package co.edu.unipiloto;

import java.util.ArrayList;
import java.util.List;
public class Perros {
    List<String> getPerros(String categoria) {
        List<String> perros = new ArrayList<>();
        if (categoria.equals("pastores")) {
            perros.add("Pastor catálan");
            perros.add("Pastor alemán");
            perros.add("Komodor");
            perros.add("Pastor australiano");
        } else {
            perros.add("Dobermann");
            perros.add("Pinscher alemán");
            perros.add("Pinscher miniatura");
            perros.add("Schnauzer");
        }
        return perros;
    }
}
