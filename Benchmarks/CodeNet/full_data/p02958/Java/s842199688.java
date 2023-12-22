import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();

        int[] p = new int[N];
        int[] pp = new int[N];

        for(int i=0; i<N; i++){
            p[i] = sc.nextInt();
            pp[i] = i+1;
        }

        int count = 0;
        for(int i=0; i<N; i++){
            if(p[i] != pp[i]) count++;
        }

        println(count==2 || count==0 ? "YES" : "NO");
    }

    public static void println(Object o){
        System.out.println(o);
    }
    public static void print(Object o){
        System.out.print(o);
    }
}
