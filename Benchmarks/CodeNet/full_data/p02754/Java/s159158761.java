import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long turn = n/(a+b);

        long diff = n-turn*(a+b);

        System.out.print(turn*a + diff);



    }
}

