import java.util.*;
 
public class Main{
    static int X;
    static int min;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        X = sc.nextInt();
        sc.close();

        int sum = 0;
        int i = 0;
        while(true){
            i++;
            sum += i;
            if(sum >= X)
                break;
        }
        System.out.println(i);
    }

}