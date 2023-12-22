import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = (a+b+c)/2;

        if(sum == a || sum == c || sum == b ){
            System.out.println("Yes");
        }else{
        System.out.println("No");
        }
    }
}
