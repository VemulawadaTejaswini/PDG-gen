import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long X = sc.nextLong();
        Long Y = sc.nextLong();
        Long sum = X * 2;//A2
        if(sum > Y){
            System.out.println("1");
            System.exit(0);
        }
        int count = 2;
        while(true){
            sum = sum * 2;//A3～
            if(sum > Y){
                System.out.println(count);
                System.exit(0);
                /*
                if(count == 2){
                    System.out.println("2");
                    System.exit(0);
                }else{
                    System.out.println(count);
                    System.exit(0);
                }
                */
            }
            count++;
        }
    }
}