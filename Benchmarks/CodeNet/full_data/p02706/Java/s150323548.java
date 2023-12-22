import java.util.*;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        new Main().run();
    }

    private void run(){
        int N = sc.nextInt();
        int M = sc.nextInt();

        for(int i = 0; i < M; i++){
            N -= sc.nextInt();
        }

        if(N < 0)N = -1;

        System.out.println(N);
        sc.close();
    }
}