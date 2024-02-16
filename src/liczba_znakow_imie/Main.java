package liczba_znakow_imie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> imiona = Arrays.asList("Przemek", "Daniel", "Dorota", "Mateusz", "Kamil" , "Małgorzata");

        long licznik = 0;

        for (String imie : imiona)
        {
            if (imie.length() >= 6) //ile imion zawiera wiecej badz 6 znakow
                licznik++;
        }
        System.out.println("Lista zawiera " + licznik + " imiona.");
    }
}
