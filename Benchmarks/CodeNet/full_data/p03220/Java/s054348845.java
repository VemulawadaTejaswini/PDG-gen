import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        int[] H = new int[N];
        for(int i = 0; i < N; i++){
            H[i] = sc.nextInt();
        }
        sc.close();

        int diff = (T-A)*1000/6;
        int index = 0;
        int min = Math.abs(H[0] - diff);
        for(int i = 1; i < N; i++){
            if(min > Math.abs(H[i]-diff)){
                min = Math.abs(H[i]-diff);
                index = i;
            }   
        }
        System.out.println(index+1);
    }
}