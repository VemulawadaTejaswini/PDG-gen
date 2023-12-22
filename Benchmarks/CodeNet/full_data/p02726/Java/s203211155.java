import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int X = scan.nextInt();
			int Y = scan.nextInt();
			
			Map<Integer,Integer>map = new TreeMap<Integer,Integer>();
			int[] m = new int[2000];
			
			
			for(int i =1;i<=N-1;i++) {
				for(int j =i+1;j<=N;j++) {
					if(i<=X&&Y<=j) {
						int dist = (X-i)+1+(j-Y);
						m[dist]++;
						//System.out.println(dist+" "+i+" "+j+" ");
						
					}else if(i>X&&Y<=j){
						int dist  =j-i;
						int xydist = i-X+1+j-Y;
						int d = dist<xydist?dist:xydist;
						m[d]++;
						//System.out.println(dist+" "+i+" "+j+" ");	
					}else if(i<=X&&Y>j) {
						int dist  =j-i;
						int xydist = X-i+1+Y-j;
						int d = dist<xydist?dist:xydist;
						m[d]++;
						//System.out.println(dist+" "+i+" "+j+" ");	
					}else if(i>X&&Y>j){
						int dist  =j-i;
						int xydist = i-X+1+Y-j;
						int d = dist<xydist?dist:xydist;
						m[d]++;
						//System.out.println(dist+" "+i+" "+j+" ");	
					}
				}
				
			}
			
		
			
			for(int i = 1;i<N;i++) {
				System.out.println(m[i]);
			}
			
			
			
			
		}
		
		
	}
		

}
