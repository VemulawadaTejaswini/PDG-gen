import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        
        for(int k=1;k<=test;k++){
        	
        	int n = in.nextInt();
        	in.nextLine();
        	String [] tt = new String [n];
        	int []number = new int [n]; 
        	for(int i=0;i<n;i++){
        		 tt[i]=in.nextLine();
        		 int ans=0;
        		 boolean [] al = new boolean [26];
        		 for(int j=0;j<tt[i].length();j++){
        			 if(tt[i].charAt(j)-'A'>=0 &&tt[i].charAt(j)-'A'<26)
        				 if(!al[tt[i].charAt(j)-'A']){
        					 al[tt[i].charAt(j)-'A']=true;
        					 ans++;
        				 }
        		 }
        		 number[i]=ans;
        		
        	}
        	
        	String tmp = tt[0];
        	int max = number[0];
        	for(int i=1;i<n;i++){
        		if(number[i]>max){
        			tmp = tt[i];
        			max = number[i];
        		}
        		if(number[i]==max)
        			if(tt[i].compareTo(tmp)<0){
        				tmp = tt[i];
            			max = number[i];
        			}
        		
        			
        	}
        	System.out.printf("Case #%d: %s\n",k,tmp);
        }
        
        
	}

}
