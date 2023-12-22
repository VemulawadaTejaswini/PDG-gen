
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("入力してください > ");
        //int    x = Integer.parseInt(scanner.nextLine());
        //int n = Integer.parseInt(scanner.nextLine());
        //String d = scanner.nextLine();
       
        double n    =  Double.parseDouble(scanner.nextLine());
        //String[] s1 =  scanner.nextLine().split(" ");
        //int m1 = Integer.parseInt(s1[0]);
        //int d1 = Integer.parseInt(s1[1]);
        
        
        double kouho = n / 1.08;
        
      //  System.out.println(kouho);
        
        int kouho1 = (int) (Math.floor(kouho) * 1.08);
        int kouho2 = (int) (Math.ceil(kouho) * 1.08);
        
       // System.out.println(kouho1);
       // System.out.println(kouho2);
        
        if( kouho1 == n){
            System.out.println((int) Math.floor(kouho));
        }
        else if( kouho2 == n){
            System.out.println((int) Math.ceil(kouho));
        }
        else{
           System.out.println(":(");
        }
        
        
        
        // Scannerクラスのインスタンスをクローズ
        scanner.close();
    }
    private static boolean kaeru(int a, int b,long x, int n){
        
        return kakaku(a, b, n) <= x;
    }
    private static int kakaku(int a, int b,int n){
        
        return a*n + b*keta(n);
    }
    private static int keta(int n){
        
        int keta = 1;
        double nn = n;
        while(nn >= 10){
            nn = nn/10.0;
            keta++;
        }
        return keta;
        
    }
}