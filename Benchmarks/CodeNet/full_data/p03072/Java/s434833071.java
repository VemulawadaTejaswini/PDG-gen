import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] H = new int[N];
        int Max = 0;
        int count = 0;

        for(int i =0; i<N; i++){
            if(i==0){
                H[i] = sc.nextInt();
                Max = H[i];
                count ++;
            }else{
                H[i] = sc.nextInt();
                Max = Math.max(Max, H[i]);
                if(H[i]>=Max){
                    count++;
                }
            }
        }
        System.out.println(count);


    }
}