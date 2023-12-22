import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = ":(";
        double i = 1.0;
        while(i<=n){
            if(Math.floor(i*1.08)==n){
                ans = String.valueOf(i);
                break;
            }
            i++;
        }
        System.out.println(ans);
    }
}