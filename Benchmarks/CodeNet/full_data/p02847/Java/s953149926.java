import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) {
      String str = "";  
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            str = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
      switch (str) {
       case "SUN":
           System.out.println("7");
       case "MON":
           System.out.println("6");
       case "TUE":
           System.out.println("5");
       case "WED":
           System.out.println("4");
       case "THU":
           System.out.println("3");
       case "FRI":
           System.out.println("2");
       case "SAT":
           System.out.println("1");
     }
}
}