import java.util.*;

class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans;
        if(n!=1){
            ans = (n%2==0)?0.5:0.6;
        }
        else{
            ans = 1;
        }
        System.out.println(ans);
    }
}