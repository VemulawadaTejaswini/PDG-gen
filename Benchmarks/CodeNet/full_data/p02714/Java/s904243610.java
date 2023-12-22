import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
         String s =scn.next();
         long count=0;
         for(int i=0;i<n;i++){
        	 for(int j=i+1;j<n;j++){
        		 if(s.charAt(i)==s.charAt(j)){
        			 continue;
        		 }
        		 for(int k=j+1;k<n;k++){
        			 if(s.charAt(k)==s.charAt(i)||s.charAt(k)==s.charAt(j)||(j-i)==(k-j)){
        				 continue;
        			 }else{
        				 count++;
        			 }
        		 }
        	 }
         }
         System.out.println(count);

	}

}