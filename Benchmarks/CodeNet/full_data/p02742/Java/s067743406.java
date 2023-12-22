import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h=sc.nextLong();
        long w=sc.nextLong();
        if(h%2==0||w%2==0){
            System.out.println(h*w/2);
        }else{
            System.out.println((h*w+1)/2);
        }
        
        
        
 
    }



}

