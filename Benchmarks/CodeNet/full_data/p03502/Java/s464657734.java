import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int nlength = 1;
        int div = 0;
        int x = 10;
        while(n != 0){
            nlength++;
            n = n/10;
        }
        for(int i = 0; i > nlength; i++){
            while(i > 0){
                if((n & 1)==1){
                div = div * x;
                }
                x = 10 * 10;
                n >>= 1;
            }
            sum = ((n / div)/10) + sum;
        }
        if(n / sum == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}