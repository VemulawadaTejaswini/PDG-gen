import java.util.*;


public class Main {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            int count = 0;
            while(n != 0){
                if (n % 10  == 2) {
                    count++;
                    n /= 10;
                }
            }
            System.out.println(count);

            sc.close();
        }
    
}

