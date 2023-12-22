import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int A = 0;
        int base = 1;
        for(int i=0; i<b; i++){
            A = A + base * a;
            base = base * 10;
        }
        int B = 0;
        base = 1;
        for(int i=0; i<a; i++){
            B = B + base * b;
            base = base * 10;
        }
        String AS = String.valueOf(A);
        String BS = String.valueOf(B);
        if(AS.compareTo(BS) <0){
            System.out.println(AS);
        }else{
            System.out.println(BS);
        }
    }
}