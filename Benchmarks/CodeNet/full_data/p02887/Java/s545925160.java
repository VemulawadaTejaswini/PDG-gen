import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		HashSet<String> str = new HashSet<String>();
		int count=0;
      
		for(int i=0; i<N; i++){
			str.add(String.valueOf(S.charAt(i)));
        }
		
		System.out.println(str.size());
    }
}
