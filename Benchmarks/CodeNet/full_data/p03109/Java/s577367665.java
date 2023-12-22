import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int n = 0;
        for(int i = 0 ; i < 4 ; i++ ){
            n += (Math.pow(10 , i) * (s.charAt(3 - i) - 48));
        }
        n *= 10000;
        n += (s.charAt(5) - 48) * 1000;
        n += (s.charAt(6) - 48) * 100;
        n += (s.charAt(8) - 48) * 10;
        n += s.charAt(9) - 48;
        if(n < 20190431){
            System.out.println("Heisei");
        }else{
            System.out.println("TBD");
        }
    }
}