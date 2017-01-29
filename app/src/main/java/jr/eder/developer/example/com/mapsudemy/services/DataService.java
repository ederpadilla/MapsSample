package jr.eder.developer.example.com.mapsudemy.services;

import java.util.ArrayList;

import jr.eder.developer.example.com.mapsudemy.model.LocationsSample;

/**
 * Created by ederpadilla on 05/11/16.
 */
public class DataService {
    private static DataService instance = new DataService();

    public static DataService getInstance() {
        return instance;
    }

    private DataService() {

    }
    public ArrayList<LocationsSample> getLocationWith10MilesOfZip(int zipCode){
        ArrayList<LocationsSample> list = new ArrayList<>();
        list.add(new LocationsSample(-99.1629441f,19.4241475f,"Metro Insurgentes","Ruta Metro Insurgentes a EH Juárez","slo"));
        list.add(new LocationsSample(-99.15430950000001f,19.4361906f,"Metro Revolucion","Plaza de la República, Tabacalera, 06030 Ciudad de México, D.F., Mexico","slo"));
        list.add(new LocationsSample(-99.14120000000003f,19.4352f,"Bellas Artes","Av. Juárez, Centro Histórico, Centro, 06050 Ciudad de México, D.F., Mexico","slo"));
        return list;
    }
}
