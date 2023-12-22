import java.util.*;
public class Main {
  public static String text;
  public static int min = Integer.MAX_VALUE;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	String s = sc.next();
      	text = s;
      	int n = s.length();
      	questionE(0,n-1);
      	System.out.println(min);
	}
  	public static void questionE(int n,int k){
      if( min < n ){
        //
      }else{
        if( k == -1 ){
          if( min > n ){
            min = n;
          }
        }else{
          int a = (int)text.charAt(k)-48;
          //questionE(n+a,k-1);
          //questionE(n+(11-a),k-1);
          if( a < 6 ){
            questionE(n+a,k-1);
          }else{
            questionE(n+(11-a),k-1);
          }
        }
      }
    }
}