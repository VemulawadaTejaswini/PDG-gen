import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        String a = scan.next();
        String b = scan.next();
        String c = scan.next();
        String cnt ;
        
        String a_bottom = a.substring( a.length()-1 , a.length() );
        String b_top    = b.substring( 0 , 1 );
        String b_bottom = b.substring( b.length()-1 , b.length() );
        String c_top    = c.substring( 0 , 1 );
        
        //ここで気を付けなければならないが、
        //String a ="a", String b = "a"であっても
        // a==bの判定はfalseになる
        //
        //この問題を解決するため、char型にわざわざ変換を行っている
        
        if( a_bottom.charAt(0) == b_top.charAt(0) &&
            b_bottom.charAt(0) == c_top.charAt(0)){
          cnt = "YES";
        }
        else cnt = "NO";
            
        System.out.println(cnt);
	  }
}