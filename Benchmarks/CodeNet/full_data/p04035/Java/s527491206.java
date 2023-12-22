import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int cut = -1;
		
		int[] ropes = new int[n];
		for(int i=0; i<n; i++) ropes[i] = sc.nextInt();
		
		for(int i=0; i<n-1; i++) {
			if(ropes[i]+ropes[i+1]>=l) {
				cut = i + 1;
				break;
			}
		}
		if(cut==-1) System.out.println("Impossible");
		else {
			System.out.println("Possible");
			for(int i=1; i<cut; i++) System.out.println(i);
			for(int i=n-1; i>cut; i--) System.out.println(i);
			System.out.println(cut); 
		}
	}
}