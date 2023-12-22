import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k=sc.nextInt();
        long a=sc.nextInt();
        long b=sc.nextInt();
        if(k<a){
            System.out.println(1+k);
            return;
        }
        k=k-a+1;
        if(k%2==0){
            if(b-a>2){
                System.out.println(a+(b-a)*k/2);
            }else{
                System.out.println(a+k);
            }
        }else{
            if(b-a>2){
                System.out.println(a+(b-a)*(k-1)/2+1);
            }else{
                System.out.println(a+k);
            }
        }
        

    }

}