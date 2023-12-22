import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String ans;
        if(a+b > c+d){
            ans = "Left";
        }else if(a+b == c+d){
            ans = "Balanced";
        }else{
            ans = "Right";
        }
        System.out.println(ans);
    }
}
