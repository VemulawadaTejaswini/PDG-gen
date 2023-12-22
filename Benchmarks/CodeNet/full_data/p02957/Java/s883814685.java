import java.util.Scanner;
 class Main{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = num1 % 2;
        int num4 = num2 % 2;
        if(num1 == 0 || num3 != 0 ){
        System.out.println("IMPOSSIBLE");
        }
        if(num2 == 0 || num4 != 0 ){
        System.out.println("IMPOSSIBLE");
        }  
        int k = (num1 + num2) / 2;
        System.out.println(k);  
}
}
