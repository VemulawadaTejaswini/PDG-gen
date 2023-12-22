import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        int count = 0;
        int baseN = 0;
        int numAdded = 1;
        int countSum = 0;
        
        for(int i = 0; i < k; i++){
            baseN += numAdded;
            countSum++;
            if(countSum == 9){
                countSum = 0;
                numAdded *= 10;
            }
            System.out.println(baseN);
        }
        
    }
}
