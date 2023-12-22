import java.util.*;
public class Main {
    public static void main(String[] args){
        Main main = new Main();
        String ans = main.solve()<0?"No":"Yes";
        System.out.println(ans);
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for(int i=0;i<n; i++) h[i] = sc.nextInt();

        for(int j=n-2;j>=0;j--){
            if(h[j]<=h[j+1]) continue;
            else if(h[j]==h[j+1]+1){
                h[j] -= 1;
            } else{
                return -1;
            }
        }
        return 0;
    }
}
