import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int a = sc.nextLong();
        //int b = sc.nextLong();
        String s = sc.next();
        //Long x = sc.nextLong();


        if(n%2 != 0){
            System.out.println("No");
        } else{
            String x = s.substring(0,n/2);
            String y = s.substring(n/2);
            if(x.equals(y)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }
}
