
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[])throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [][] City=new int[M][2];
		String string = "";

		int k=1;
		for(int i=0;i<M;i++) {
			City[i][0]=sc.nextInt();
			City[i][1]=sc.nextInt();
			string = string +City[i][0]+" ";
		}
			
		while(k<=N){
			if(string.contains(k+" ")){
				ArrayList<Integer> list = new ArrayList<>();
				for(int i=0;i<M;i++) {
					if(City[i][0]==k) {
						list.add(City[i][1]);
					}
				}
		        Collections.sort(list);
		        
				for(int i=0;i<M;i++) {
					if(City[i][0]==k) {
						for(int j=0;j<list.size();j++) {
							if(City[i][1]==list.get(j)){
								City[i][1]=j+1;
								break;
							}
						}
					}	
				}
			}
		    
			k=k+1;
		}
		
		for(int i=0; i<M;i++) {
			String str1=String.format("%06d", City[i][0]);
			String str2=String.format("%06d", City[i][1]);
			System.out.println(str1+str2);
		}

	}

}
