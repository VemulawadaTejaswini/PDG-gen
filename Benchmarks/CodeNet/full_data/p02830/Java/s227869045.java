import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str1 = sc.next();
        String str2 = sc.next();
        String ans = "";
        
        for(int i=0; i<N*2; i++){
            if(i%2==0){
                ans += str1.charAt(i/2);
            }else{
                ans += str2.charAt(i/2);
            }
        }
        
        System.out.println(ans);
    }
}