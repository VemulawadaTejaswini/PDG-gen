import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int min = 1001;
        for(int i = 1; i <= N; i++){
            int c = sc.nextInt();
            int t = sc.nextInt();
            if(t <= T){
                if(c < min){
                    min = c;
                }
            }
        }
        sc.close();
        if(min > 1000){
            System.out.println("TLE");
        }else{
            System.out.println(min);
        }

    }

}
