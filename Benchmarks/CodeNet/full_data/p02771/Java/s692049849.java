import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int a,b,c;
		// 整数の入力
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
 
        if(a==b && a!=c && b!=c){
            System.out.println("Yes");
        }else if(a==c && a!=b && c!=b){
            System.out.println("Yes");
        }else if(b==c && b!=a && c!=a){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
	}
}