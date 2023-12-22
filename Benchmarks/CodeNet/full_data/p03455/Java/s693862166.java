import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a * b;
        
        show(isEven(calc2(sum)));
    }
    
    public static boolean isEven(int num){
        if(num == 0){
            return true;
        }
        return false;
    }
    
    //最後まで2で割る(再帰関数)
    public static int calc2(int num){
        if(num > 2){
            calc2(num / 2);
        }
        return num;
    }
    
    public static void show(boolean flag){
        if(flag){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}