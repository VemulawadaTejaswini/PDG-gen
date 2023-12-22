import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        String[] list = new Scanner(System.in).nextLine().split(" ");
        BigInteger h = new BigInteger(list[0]);
        BigInteger w = new BigInteger(list[1]);
        if(h.multiply(w).mod(new BigInteger("2")).equals(0)){
            System.out.println(h.multiply(w).toString());
        }else{
            System.out.println(h.multiply(w).add(new BigInteger("1")).toString());
        }
    }
}