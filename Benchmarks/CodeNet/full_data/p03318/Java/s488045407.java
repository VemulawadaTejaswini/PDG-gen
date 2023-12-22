import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        int count = 1;
        int baseN = 0;
        while(count < k + 1){
            baseN++;
            int n = baseN;
            int s = 0;
            while(n > 0){
                s += n % 10;
                n /= 10;
            }
            if(s == count){
                System.out.println(baseN);
                count++;
            }
        }
        
    }
}
