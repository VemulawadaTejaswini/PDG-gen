import java.util.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char [] s = sc.next().toCharArray();
		int x = 0;
		int max = x;
		
		for(int i = 0; i < n; i++){
		switch(s[i]){
		case 'I': x += 1; break;
		case 'D': x -= 1; break;
		default : 
		}
		if(max < x){ max = x; }
		}
		System.out.println(max);
	}
}
