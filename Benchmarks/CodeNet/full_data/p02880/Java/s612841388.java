import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

        if(N<=9){
        System.out.print("Yes");
        }else if(N<=18 && N%2==0){
        System.out.print("Yes");
        }else if(N<=27 && N%3==0){
        System.out.print("Yes"); 
        }else if(N<=36 && N%4==0){
        System.out.print("Yes");
        }else if(N<=45 && N%5==0){ 
        System.out.print("Yes");
        }else if(N<=54 && N%6==0){
        System.out.print("Yes");
        }else if(N<=63 && N%7==0){
        System.out.print("Yes");
        }else if(N<=72 && N%8==0){ 
        System.out.print("Yes");
        }else if(N<=81 && N%9==0){
        System.out.print("Yes");
        }else{
        System.out.print("No");
        }
}
}