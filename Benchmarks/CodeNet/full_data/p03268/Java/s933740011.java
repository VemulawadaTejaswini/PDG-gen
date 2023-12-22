import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        
        if(k%2 == 0){
            long x = 0;
            long y = 0;
            for(int i = 1; i <= n; i++){
                if(i%k == 0){
                    x++;
                }else if(i%k == k/2){
                    y++;
                }
            }
            System.out.println(x*x*x + y*y*y);
        }else{
            long x = 0;
            for(int i = 1; i <= n; i++){
                if(i%k == 0){
                    x++;
                }
            }
            System.out.println(x*x*x);
        }
    }
}