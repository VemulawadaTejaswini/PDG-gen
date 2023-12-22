
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("入力してください > ");
        //int    x = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int[] data = new int[n];
        
        String[] ss = scanner.nextLine().split(" ");
        
        int total = 0;
        for(int i = 0 ; i < n ; i++){
            data[i] = Integer.parseInt(ss[i]);
            total += data[i] ;
        }
        
        int temp1 = 0;
        int temp2 = total;
        
        int ans = Integer.MAX_VALUE;
        
        for(int del = 0 ; del < n ; del++){

            temp1 += data[del];
            temp2 -= data[del];
            
            int operate = Math.abs(temp1-temp2);
            
            if(operate < ans) ans = operate;
        }
        System.out.println(ans);
        
        
        // Scannerクラスのインスタンスをクローズ
        scanner.close();
    }
}