import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        if(1<=N && N<=9){
            System.out.println(N);
        }else if(10<=N && N<=99){
            System.out.println(9);
        }else if(100<=N && N<=999){
            System.out.println(9+N-99);
        }else if(1000<=N && N<=9999){
            System.out.println(909);
        }else if(10000<=N && N<=99999){
            System.out.println(909+N-9999);
        }else{
            System.out.println(90909);
        }
        
    }
}