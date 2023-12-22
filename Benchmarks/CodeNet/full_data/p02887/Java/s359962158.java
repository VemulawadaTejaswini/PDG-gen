import java.util.*;
public class Main{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
      sc.nextLine();
	  String s = sc.nextLine();
	  char[] c = s.toCharArray();
      int sum = 0;
      char last = '1';
	  for(int i=0;i<n;i++){
	  	if(last != c[i])sum++;
        last = c[i];
	  }
	  System.out.println(sum);

	}
}