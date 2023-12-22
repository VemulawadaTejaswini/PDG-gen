import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int sc = scan.nextInt();
        int ch =10000;
        String data = String.valueOf(sc);
        String[] result = new String[String.valueOf(sc).length()];
        for (int i = 0; i < data.length()-2; i++) {
        result[i] = String.valueOf(data.charAt(i))+String.valueOf(data.charAt(i+1))+String.valueOf(data.charAt(i+2)); 
        int j = Integer.parseInt(result[i]);
       
        sc = j-753;
        sc = Math.abs(sc);
        if(sc <ch )
        {
            ch = sc;
        }
       
        }
     System.out.println(ch);  
    }
}