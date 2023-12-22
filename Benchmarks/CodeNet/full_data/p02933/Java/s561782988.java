import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        String S;


        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            S = sc.next();
        }

        if(N >= 3200){
            System.out.println(S);
        }else{
            System.out.println("red");
        }
    }

}
