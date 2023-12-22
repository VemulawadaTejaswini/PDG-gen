import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        int num1 = cin.nextInt();
        int num2 = cin.nextInt();
        int count = (num1 == 1 && num2 == 1) ? 1
        		  : (num1 == 1 || num2 == 1) ? num1 * num2 - 2
        		  : (num1 - 2) * (num2 - 2);

        System.out.println(count);
    }
}