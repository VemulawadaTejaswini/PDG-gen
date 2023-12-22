import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int min = 1001;
        
        for(int i = 0; i < n; i++){
            int c = sc.nextInt();
            int tt = sc.nextInt();
            if(tt <= t && c < min){
                min = c;
            }
        }
        if(min == 1001){
            System.out.println("TLE");
        }else{
            System.out.println(min);
        }
    }
}
