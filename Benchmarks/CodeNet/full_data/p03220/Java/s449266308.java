import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),t =sc.nextInt(),a=sc.nextInt();
        int[] h = new int[n];
        int ans = 0;
        for(int i = 0;i<n;i++){
            h[i] = sc.nextInt();
            if(Math.abs(a-(t-h[i]*6/1000))<Math.abs(a-(t-h[ans]*6/1000))){
                ans = i;
            }
        }
        System.out.println(ans+1);
    }
}
