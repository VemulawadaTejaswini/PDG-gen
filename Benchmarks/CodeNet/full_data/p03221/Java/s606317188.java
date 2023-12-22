import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main{
	
	public static void main(String args[])throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [][] City=new int[M][2];
		
		
		int k=1;
		for(int i=0;i<M;i++) {
			City[i][0]=sc.nextInt();
			City[i][1]=sc.nextInt();
		}
		sc.close();	
		while(k<=N){
		    ArrayList<Integer> list = new ArrayList<>();
			for(int i=0;i<M;i++) {
				if(City[i][0]==k) {
					list.add(City[i][1]);
				}
			}
	        Collections.sort(list);
	        int l=list.size();
			for(int i=0;i<M;i++) {
				if(City[i][0]==k) {
					int z=City[i][0];
					for(int j=0;j<l;j++) {
						int c=list.get(j);
						if(City[i][1]==c){
							City[i][1]=j+1;
						}
					}
				}	
			}
			k=k+1;
		}
		for(int i=0; i<M;i++) {
			String string1=City[i][0]+"00000";
			String string2=City[i][1]+"00000";
	        string1=string1.substring(0,6);
	        string2=string2.substring(0,6);
			System.out.println(new StringBuilder(string1).reverse()+""+new StringBuilder(string2).reverse());
		}

	}

}
