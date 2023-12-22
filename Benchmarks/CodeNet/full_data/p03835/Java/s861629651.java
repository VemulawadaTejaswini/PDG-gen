
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
		int c=0;
		int x,y,z;
		for(x=k;x>=0;x--) {
			for(y=k;y>=0;y--) {
				for(z=k;z>=0;z--) {
					if(x+y+z==s)c++;
				}
			}
		}
		System.out.println(c);
	}
}