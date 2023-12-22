import java.util.*;

class Main{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans= 0;
        int max = 0;
        int min = 1000;
        for(int i = 0; i < N; i++){
            ans = sc.nextInt();
            if(max < ans){
                max = ans;
            } 
            if(min >ans){
                min = ans;
            }
        }
        System.out.println(max-min);
    }
}