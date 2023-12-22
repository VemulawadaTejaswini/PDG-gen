
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
        
        for(int i = 0 ; i < n ; i++){
            data[i] = Integer.parseInt(ss[i]);
        }
        //
        
        int ans = Integer.MAX_VALUE;
        
        for(int del = 1 ; del < n ; del++){

            int temp1 = 0;
            int temp2 = 0;
        
            for(int i1 = 0  ; i1 < del ; i1++){
                temp1 += data[i1];
            }
            for(int i2 = del ; i2 < n  ; i2++){
                temp2 += data[i2];
            }
            int operate = Math.abs(temp1-temp2);
            
            if(operate < ans) ans = operate;
             //System.out.println(operate);
        }
        System.out.println(ans);
        
        
        // Scannerクラスのインスタンスをクローズ
        scanner.close();
    }
}