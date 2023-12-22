import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[])throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [][] City=new int[M][2];
		int[] sort = new int [M];
		int [] tag = new int[N];
	    int value =0;
	  
	
		for(int i=0;i<M;i++) {
			City[i][0]=sc.nextInt();
			int x = sc.nextInt();
			String str = String.format("%03d", x);
			str=City[i][0]+""+str;
			City[i][1]=Integer.parseInt(str);
			sort[i]=Integer.parseInt(str);
		}
		Arrays.sort(sort);
		int x=0;
		for(int i=0;i<M;i++) {
			String s = sort[i]+"";
			int k =Integer.parseInt(s.substring(0,1));
			if(k==1) {
				x=x+1;
				sort[i]=Integer.parseInt(s+x+"");
			}else {
				if(tag[k-1]==1) {
					x=x+1;
					sort[i]=Integer.parseInt(s+x+"");
				}else {
					x=1;
					sort[i]=Integer.parseInt(s+x+"");
					tag[k-1]=1;
				}
				
			}
		}
		
		for(int i=0;i<M;i++) {
		     for(int j=0;j<M;j++) {
		    	 String string = sort[j]+"";
		    	 if(Integer.parseInt(string.substring(0, 4))==City[i][1]) {
			    	 String string2 = string.substring(4);
			    	 value=Integer.parseInt(string2);
		    		 City[i][1]=value;
		    		 break;
		    	 }
		     } 
			System.out.print(String.format("%06d", City[i][0]));
			System.out.println(String.format("%06d", City[i][1]));
		}
		
			
					
	}

}
