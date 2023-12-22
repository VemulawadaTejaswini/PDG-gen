import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int m = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        
        int count = 0;
        for(int month = 1; month <= m; month++){
            for(int day = 22; day <= d; day++){
                int d1 = day % 10;
                int d10 = day / 10;
                if(d1 < 2 || d10 < 2){
                    continue;
                }
                if(d1 * d10 == month){
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}