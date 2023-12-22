import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int ans = 0;
        if(m > 1 && n>1){
            ans = (m-2)*(n-2);   
        }else{
            if(n == 1 && m > 1){
                ans = m-2;
            }else if(m == 1 && n > 1){
                ans = n-2;
            }else if(n== 1 && m==1){
                ans = 1;
            }
        }
        System.out.println(ans);
    }
    
}