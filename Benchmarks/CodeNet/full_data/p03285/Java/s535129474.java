import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count = 0;
        int count4 = 0;
        while(count < n){
            count += 4;
            count4++;
        }
        
        String result = "No";
        
        while(count4 > 1 && count != n){
            count4 -= 2;
            count -= 1;
        }
        if(count == n){
            result = "Yes";
        }
        
        System.out.println(result);
        
    }
}
