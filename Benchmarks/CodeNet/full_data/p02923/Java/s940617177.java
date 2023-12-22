import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int h[] = new int[n];
        Arrays.setAll(h, i -> stdIn.nextInt());
        int cou = 0;
        int ans = 0;

        for(int i = 0 ; i < n-1; i++){
            if(h[i] >= h[i+1]) cou++;
            else cou = 0;

            if(ans < cou){
                ans = cou;
            }
        }
    
        System.out.println(ans);
    }
}