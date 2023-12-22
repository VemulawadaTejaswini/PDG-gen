import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String ar = sc.next();
String[] s = ar.split("");
               boolean flg = true;
if(ar.length() != a+b+1) flg = false;
		for(int i = 0; i < a; i++){
                     if( s[i].equals("-")) flg = false;
               }
               if ( !(s[a].equals("-"))) flg =false;
		for(int i = a+1; i < b; i++){
                     if( s[i].equals("-") )flg =false;
               }
              if (flg)                System.out.print("yes");
             else  System.out.print("no");
	}
}
