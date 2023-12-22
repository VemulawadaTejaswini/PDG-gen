import java.util.HashMap;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 HashMap<Character,Integer  > hm= new HashMap<Character,Integer>();

		String a=sc.next();
		int sum=700;
		for(int i=0;i<a.length();i++) {
			int v;
			char b=a.charAt(i);
			if(hm.containsKey(b)){
				v=hm.get(b)+1;
}
			else {
				v=1;
			}
hm.put(b, v);


		}

int ans=hm.get('o');
sum=sum+ans*100;
System.out.println(sum);

}

}