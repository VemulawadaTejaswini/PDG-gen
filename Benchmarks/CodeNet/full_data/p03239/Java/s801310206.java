import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int T = Integer.parseInt(sc.next());
        
        int min = 10000;
        for(int i = 0; i < n; i++){
            int c = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            if(t <= T && c < min){
                min = c;
            }
        }
        
        if(min <= T){
            System.out.println(min);
        }else{
            System.out.println("TLE");
        }
    }
}