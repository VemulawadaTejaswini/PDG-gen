import java.util.*;

public class Main {

  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int x=0;
	String str=sc.next();
	Set<Integer>set=new HashSet<>();
	set.add(0);
	for(int i=0;i<n;i++){
		if(str.charAt(i)=='I'){
			x++;
			set.add(x);
		}
		else {
			x--;
			set.add(x);
		}
	}
	System.out.println(Collections.max(set));
	sc.close();
  }
}
