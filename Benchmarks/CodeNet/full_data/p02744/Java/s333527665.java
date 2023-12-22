import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int n =scn.nextInt();
		 String s="";
		 ArrayList<StringBuilder> sb =res(n,0,0,s);
		 for(StringBuilder sb1 : sb){
			 System.out.println(sb1);
		 }

	}
	public static ArrayList<StringBuilder> res(int n,int i ,int j ,String s){
		if(j==26){
			ArrayList<StringBuilder> al =new ArrayList<>();
			return al;
		}
		
		if(i==n-1){
			ArrayList<StringBuilder> bs =new ArrayList<>();
			StringBuilder sb = new StringBuilder();
			sb.append((char)(j+'a'));
			bs.add(sb);
			return bs;
		}
		ArrayList<StringBuilder> myres=new ArrayList<>();
		ArrayList<StringBuilder> l=res(n,i+1,j,s);
		ArrayList<StringBuilder> r =res(n,i+1,j+1,s);
		 for(StringBuilder s1 : l){
			 StringBuilder s2=new StringBuilder();
			 s2.append((char)(j+'a'));
			  s2.append(s1);
			  myres.add(s2);
			  }
		 for(StringBuilder s1 : r){
			 StringBuilder s2=new StringBuilder();
			 s2.append((char)(j+'a'));
			  s2.append(s1);
			  myres.add(s2);
			  }
		 
		 return myres;
		 
	}

}