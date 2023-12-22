import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

      	String sc = s.next();
        HashMap<String, String> wether = new HashMap<String, String>();
      
        wether.put("Sunny", "Cloudy");
        wether.put("Cloudy", "Rainy");
        wether.put("Rainy", "Sunny");
       
        System.out.println(wether.get(sc));
    }
}