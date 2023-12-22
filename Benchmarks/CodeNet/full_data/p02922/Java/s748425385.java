import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int n = 0;        
        for(int i=0; i<=20; i++){
        if((A-1)*i+1<B){
         n++;
    }
        }    
            System.out.print(n);
        }
}
