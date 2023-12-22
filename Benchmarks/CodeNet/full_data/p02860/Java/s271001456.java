import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n=0;
        String s="";
        try {
            String str = reader.readLine();
            n = Integer.parseInt(str);
            s = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(n % 2 == 1){
            System.out.println("No");
        } else{
            int r = n / 2;
            String s1 = s.substring(0,r);
            String s2 = s.substring(r,n);
            if(s1.equals(s2)){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
        }
    }
}