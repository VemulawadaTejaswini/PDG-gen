import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	String s = sc.next();
      	int ans = 0;
      	int fast = 0;
      	int last = 0;
      	for(int i=0;i<s.length();i++){
          if( s.charAt(i) == '#' ){
            fast = i;
            break;
          }
        }
      	for(int i=s.length()-1;i>-1;i--){
          if( s.charAt(i) == '.' ){
            last = i;
            break;
          }
        }
      
      	for(int i=fast;i<last+1;i++){
          if( s.charAt(i) == '.' ){
          	ans++;
          }
        }
      System.out.println(ans);
	}
}