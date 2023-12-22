import java.util.*;
import java.io.*;
public class Main{

    public static void main(String []args) throws Exception {
        //BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String [] str = sc.nextLine().split(" ");
        long n = Long.parseLong(str[0]);
        long k = Long.parseLong(str[1]);
        long min = n ;
        while(true){
            n = Math.abs(n-k);
            if(n < min){
                min = n;
            }else{
                System.out.println(min);
                break;
            }
        }
        
    }
}