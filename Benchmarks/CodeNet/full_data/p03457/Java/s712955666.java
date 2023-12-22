import java.util.Scanner;

public class Main{
    public  static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
    		int N=sc.nextInt();
    		int[] t=new int[100001];
    		int[] x=new int[100001];
    		int[] y=new int[100001];
    		for(int i=0; i<N; i++) {
    			t[i+1]=sc.nextInt();
    			x[i+1]=sc.nextInt();
    			y[i+1]=sc.nextInt();
    		}
    		boolean can=true;
    		for(int i=0; i<N; i++) {
    			int dt=t[i+1]-t[i];
    			int dist=Math.abs(x[i+1]-x[i])+Math.abs(y[i+1]-y[i]);
    			if(dt<dist) {
    				can=false;
    			}
    			if(dist%2!=dt%2) {
    				can=false;
    			}
    		}
    		if(can)	System.out.println("Yes");
    		else	System.out.println("No");
    	}
    }
}