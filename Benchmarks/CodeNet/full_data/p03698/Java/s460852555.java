import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
		int[] check = new int[26];
		int x=0;
		for(int i=0;i<s.length();i++) {
			int num= s.charAt(i)-'a';
			//System.out.println(num);
			check[num]+=1;
			if(check[num]==2) {
				x=1;
				break;
			}
		}
		System.out.println((x==1)? "no":"yes");
    }
}