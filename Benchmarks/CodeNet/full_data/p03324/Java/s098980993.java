import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        int d = sc.nextInt();
        int n = sc.nextInt();
        
        int baseNum = 1;
        for(int i = 0; i < d; i++){
            baseNum = baseNum * 100;
        }
        
        System.out.println(baseNum * n);
        
    }
}
