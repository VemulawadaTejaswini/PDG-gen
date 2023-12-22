import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double result = b / a;
        int intResult = (int)result;

        if(result > c){
            System.out.println(c);
        }else if(result < c){
            System.out.println(intResult);
        }
    }
}