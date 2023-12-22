import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int sc = scan.nextInt();
        int ch =100;
        String data = String.valueOf(sc);
      
        for (int i = 0; i < data.length()-2; i++) {
     
        
        sc = Math.abs(Integer.parseInt(data.substring(i,i+3))-753);
       
        if(sc <ch )
        {
            ch = sc;
        }
       
        }
     System.out.println(ch);  
    }
}
