import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int t = a+b;
    if(t<24) { 
    	System.out.print(t);
    }else {
    	System.out.print(t-24);
    }
}
}