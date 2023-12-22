import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        sc.close();

        if(k % 2 == 0){
            System.out.println(2);
            System.out.println((k/2) + " " + (k/2+1));
        }else{
            System.out.println(2);
            System.out.println(((k+1)/2-1) + " " + ((k+1)/2+1));
        }
    }
}