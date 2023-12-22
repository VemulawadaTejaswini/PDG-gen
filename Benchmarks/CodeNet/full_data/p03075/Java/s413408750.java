import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int x[] = new int[5];
        for(int i = 0; i < 5; i++){
            x[i] = stdIn.nextInt();
        }
        
        //int a = stdIn.nextInt();
        //int b = stdIn.nextInt();
        //int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        
        if(x[4] - x[0] <= k){
            System.out.println("Yay!");
        }else{
            System.out.println(":(");
        }
        
        //System.out.println();
        //System.out.print();
    }
}
