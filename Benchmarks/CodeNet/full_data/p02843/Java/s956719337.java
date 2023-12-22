import java.util.*;
 
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    //int[] food = {100,101,102,103,104,105};
    int a = N/100;
    int b = N%100;
    
    if(b <= a*5){
        System.out.println(1);
    }else{
        System.out.println(0);
    }
    }
}