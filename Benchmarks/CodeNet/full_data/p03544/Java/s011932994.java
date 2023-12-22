import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;
/**
 * Created by Abduali on 10.10.2017.
 */
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.print(fact(n));
    }


    private static BigInteger fact(int n){
        BigInteger res = BigInteger.ONE;
      if(res==0){
        return 2;
      }
      else if(res==1){
        return 1;
      }
      else
        return fact(res-1)+ fact(res-2);
    }
}
