
import Figuras.Cercle;
import Figuras.Figura;
import Figuras.Quadrat;
import Figuras.Rectangle;

import java.util.Arrays;

public class GestorClasses {
    public static void sort (Figura[] v){
        Arrays.sort(v);
    }

    public static double suma (Figura[] v){
        double ret = 0;
        for (Figura f:v){
            ret+= f.area();
        }
        return ret;
    }

    public static void main(String[] args) {
        Figura[] v= new Figura[6];
        v[0] = new Quadrat(2);
        v[1] = new Rectangle(2,1);
        v[2] = new Cercle(5);
        v[3] = new Cercle(3);
        v[4] = new Quadrat(6);
        v[5] = new Rectangle(7,6);

        double r = GestorClasses.suma(v);

        System.out.println(r);
        System.out.println(Arrays.asList(v));
        GestorClasses.sort(v);
        System.out.println(Arrays.asList(v));
    }
}



