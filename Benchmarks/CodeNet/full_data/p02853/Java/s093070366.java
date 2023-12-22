
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("入力してください > ");
        //int    x = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        
        String[] ss = s.split(" ");
        
        int x = Integer.parseInt(ss[0]);
        int y = Integer.parseInt(ss[1]);
        
        int money = 0;
        
        if(x == 1) money += 300000;
        if(x == 2) money += 200000;
        if(x == 3) money += 100000;
        if(y == 1) money += 300000;
        if(y == 2) money += 200000;
        if(y == 3) money += 100000;
        
        if(x==1 && y==1) money += 400000;
        
        System.out.println(money);
        
        // Scannerクラスのインスタンスをクローズ
        scanner.close();
    }
}