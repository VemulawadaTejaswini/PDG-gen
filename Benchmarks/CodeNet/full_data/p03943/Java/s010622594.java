import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
	Scanner sc  = new Scanner(System.in);
        
    int cnt = 0;

	int  i1 = 0 ,i2 = 0, i3 = 0;
	long L1 = 0, L2 = 0, L3 = 0;
	char ch;
	String str = "";
		

//  String s1 = sc.next();
//  char[] c1 = s1.toCharArray();

    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
//  int[] test  = new int[W];
/*  while(true){
        test[cnt] = Integer.parseInt(sc.next());
        o++;
        if(cnt==N)break;
    }
*/
    str = "No";
    if( a+b == c  ) str ="Yes";
    if( b+c == a  ) str ="Yes";
    if( a+c == b  ) str ="Yes";

        System.out.print(str);
        System.out.println();
	}
        
}