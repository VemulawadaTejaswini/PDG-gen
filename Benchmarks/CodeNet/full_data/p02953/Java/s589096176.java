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
            if(h[i]>h[i+1]){
                h[i]-=1;
                if(h[i]>h[i+1]){
                    ans = false;
                    break;
                }
                if(i!=0&&h[i-1]>h[i]){
                    ans = false;
                    break;
                }
            }
        }
        System.out.println(ans?"Yes":"No");
    }
}