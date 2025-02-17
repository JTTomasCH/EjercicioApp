package co.edu.unipiloto;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends Activity {

    private BeerExpert expert = new BeerExpert();
    private Perros perros = new Perros();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view) {
        //Get a reference to the TextView
        TextView brands = (TextView) findViewById(R.id.brands);
        //Get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Get the selected item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        //Get recommendations from the BeerExpert class
        List<String> brandsList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : getBrandsList(brandsList)) {
            brandsFormatted.append(brand).append('\n');
        }
        //Display the beers
        brands.setText(brandsFormatted);
    }

    public void ClickEncontrarPerros(View view) {
        //Get a reference to the TextView
        TextView razas = (TextView) findViewById(R.id.razas);
        //Get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color2);
        //Get the selected item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        //Get recommendations from the BeerExpert class
        List<String> brandsList = perros.getPerros(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String perros : getBrandsList(brandsList)) {
            brandsFormatted.append(perros).append('\n');
        }
        //Muestra los perros
        razas.setText(brandsFormatted);
    }

    private static List<String> getBrandsList(List<String> brandsList) {
        return brandsList;
    }
}