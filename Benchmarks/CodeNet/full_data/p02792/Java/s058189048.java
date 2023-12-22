import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int cnt = 0;

      	for (int i=1 ; i<=n ; i++) {
          for (int j=1; j<=n ; j++) {
            char[] istr = Integer.toString(i).toCharArray(); 
            char[] jstr = Integer.toString(j).toCharArray(); 
            if ((istr[0] == jstr[jstr.length -1]) && (istr[istr.length - 1] == jstr[0])){
              cnt++;
            }
          }
        }
           System.out.print(Integer.toString(cnt));
       
   
	}
}