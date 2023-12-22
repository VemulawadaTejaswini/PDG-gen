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
         for(int i=0;i<al.get(0).size();i++){
        	 for(int j=0;j<al.get(1).size();j++){
        		 for(int k=0;k<al.get(2).size();k++){
        			 if(Math.abs(al.get(0).get(i)-al.get(1).get(j))!=Math.abs(al.get(1).get(j)-al.get(2).get(k))&&
        					 Math.abs(al.get(0).get(i)-al.get(2).get(k))!=Math.abs(al.get(1).get(j)-al.get(2).get(k))&&
        					 Math.abs(al.get(0).get(i)-al.get(2).get(k))!=Math.abs(al.get(1).get(j)-al.get(0).get(i)) ){
        				 count++;
        			 }
        		 }
        	 }
         }
         System.out.println(count);

	}

}