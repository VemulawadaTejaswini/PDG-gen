import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
         String s =scn.next();
         long count=0;
          ArrayList<ArrayList<Integer>> al = new ArrayList<>();
         for(int i=0;i<3;i++){
        	 ArrayList<Integer> al1= new ArrayList<>();
        	 al.add(al1);
         }
         for(int i=0;i<n;i++){
        	 char ch=s.charAt(i);
        	 if(ch=='R'){
        		 ArrayList<Integer> al1 = al.get(0);
        		 al1.add(i);
        		 continue;
        	 }
        	 if(ch=='B'){
        		 ArrayList<Integer> al2 = al.get(1);
        		 al2.add(i);
        		 continue;
        	 }
        	 ArrayList<Integer> al3 = al.get(2);
        	 al3.add(i);
        	 
        	 
        	 
         }
         long val = (long)(al.get(0).size()*al.get(1).size()*al.get(2).size());
         
         for(int i=0;i<n;i++){
        	 for(int j=1;j<n;j++){
        		 if(i+j<n && i+j+j<n){
        			 if(s.charAt(i)!=s.charAt(i+j) && s.charAt(i+j)!=s.charAt(i+j+j)&& s.charAt(i)!=s.charAt(i+2*j)){
        				 count++;
        			 }
        		 }else{
        			 break;
        		 }
        	 }
         }
         val-=count;
         System.out.println(val);

	}

}