import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int A = 0;
    int B = 0;
    for(int i= 1; i <= b ; i++ ){
        int v = (int)Math.pow(10,i-1);
        A += v*a;
    }
    for(int i= 1; i <= a ; i++ ){
        int z = (int)Math.pow(10,i-1);
        B += z*b;
    }
    if(A>=B){
        System.out.println(A);
    }else{
        System.out.println(B);
    }

        sc.close();
    }    
}
