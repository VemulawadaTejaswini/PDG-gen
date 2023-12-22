import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = n/(a+b);
    
    if(a==0){
    System.out.print("0");
    }else if(n%(a+b)<=a){
    System.out.println(a*k+n%(a+b));
    }else{
    System.out.println(a*k+a);
}
}
}