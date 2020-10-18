import java.util.HashMap;
import java.util.ResourceBundle;

public class Idiomas{
    private static Idiomas manager;

    HashMap<String, ResourceBundle> data;

    private Idiomas(String language){
        this.data = new HashMap<>();
        ResourceBundle rb = ResourceBundle.getBundle(language);
        this.data.put(language,rb);

        /*ResourceBundle ca = ResourceBundle.getBundle("ca");
        ResourceBundle es = ResourceBundle.getBundle("es");
        ResourceBundle en = ResourceBundle.getBundle("en");
        this.data.put("ca",ca);
        this.data.put("es",es);
        this.data.put("en",en);*/
    }

    public static Idiomas getInstance(String language){
        manager = new Idiomas(language);
        return manager;
    }

    public String getText(String language, String key){
        String result;
        result = this.data.get(language).getString(key);
        return result;
    }

    /*public static void main(String[] args){
        String msg1 = Idiomas.getInstance().getText("ca","l2");
        String msg2 = Idiomas.getInstance().getText("es","l2");
        String msg3 = Idiomas.getInstance().getText("en","l2");

        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println(msg3);

    }*/




}









