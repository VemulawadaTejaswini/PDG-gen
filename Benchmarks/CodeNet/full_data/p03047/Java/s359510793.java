import java.util.Scanner;
public class Main{
    public static void  main(String args[]){

        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;

        for(int r = 0;R * r <= N ; r++){
            for(int g = (N - R * r);G * g <= (N - R * r); g++){
                for(int b = (N -(R * r + G * g) );B * b <= (N - G * g) ; b++){
                    if((R * r + G * g + B * b) == N){
                        sum ++;
                        break;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}
