import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] a = new String[n];
		for(int i=0; i<a.length; i++){
			a[i] = scn.next();
		}
      	ArrayList<String> list = new ArrayList<>();
      	for(int i=0; i<a.length; i++){
          list.add(a[i]);
          Collections.reverse(list);
        }
      	for(int i=0; i<list.size(); i++){
          String ans = list.get(i);
          System.out.print(ans + " ");
        }
	}
}
