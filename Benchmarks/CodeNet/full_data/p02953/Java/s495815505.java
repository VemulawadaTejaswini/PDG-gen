import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        boolean ans = true;
        for(int i =0;i<n;i++){
            h[i] = Integer.parseInt(sc.next());
        }
        for(int i =0;i<n-1;i++){
            if(h[i]-h[i+1]==1){
                if(i==0){
                    h[i]-=1;
                } else {
                    if(h[i]-h[i-1]==1||h[i]-h[i-1]==2){
                        h[i]-=1;
                    } else {
                        ans = false;
                        break;
                    }
                }
            } else if(h[i]-h[i+1]>=2) {
                ans = false;
                break;
            }
        }
        System.out.println(ans?"Yes":"No");
    }
}