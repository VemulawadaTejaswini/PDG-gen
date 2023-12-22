import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      s.useDelimiter("\n");
      int n = s.nextInt();
      
      String ans = "No";
        for (int i = 1; i < 10; i++) {
            for(int m = 1; m < 10; m++) {
                if (i * m == n) ans = "Yes";
            }
        }
        
        System.out.println(ans);
    }
}

