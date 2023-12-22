import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt(),rm=0,gm=0,bm=0;
	  long count=0,buff=0;
	  String s=sc.next();
	  int[] r=new int[s.length()],g=new int[s.length()],b=new int[s.length()];
	  for(int i=0;i<s.length();i++) {
		  if(s.substring(i, i+1).equals("R"))rm++;
		  if(s.substring(i, i+1).equals("G"))gm++;
		  if(s.substring(i, i+1).equals("B"))bm++;
	  }
	  for(int i=0;i<s.length();i++) {
		  r[i]=rm;
		  g[i]=gm;
		  b[i]=bm;
		  if(s.substring(i, i+1).equals("R"))rm--;
		  if(s.substring(i, i+1).equals("G"))gm--;
		  if(s.substring(i, i+1).equals("B"))bm--;
	  }
	  for(int i=0;i<s.length()-1;i++) {
		  for(int j=i+1;j<s.length();j++) {
			  if(!s.substring(i, i+1).equals(s.substring(j, j+1))) {
				  if(2*j-i+1<=s.length()) {
					  if(!s.substring(2*j-i,2*j-i+1).equals(s.substring(i, i+1)) && !s.substring(2*j-i,2*j-i+1).equals(s.substring(j, j+1))) {
						  buff++;
					  }
				  }
			  }
		  }
	  }
	  boolean R=true,G=true,B=true;
	  for(int i=0;i<s.length()-2;i++) {
		  for(int j=i+1;j<s.length()-1;j++) {
			  if(s.substring(i, i+1).equals(s.substring(j, j+1)))continue;
			  else {
				  if(s.substring(i, i+1).equals("R"))R=false;
				  if(s.substring(i, i+1).equals("G"))G=false;
				  if(s.substring(i, i+1).equals("B"))B=false;
				  if(s.substring(j, j+1).equals("R"))R=false;
				  if(s.substring(j, j+1).equals("G"))G=false;
				  if(s.substring(j, j+1).equals("B"))B=false;
				  if(R) {
					  count+=r[j+1];
				  }else if(G) {
					  count+=g[j+1];
				  }else if(B) {
					  count+=b[j+1];
				  }
			  }
			  R=true;
			  G=true;
			  B=true;
			//System.out.println(count);
		  }
	  }
	  /*System.out.println(Arrays.toString(r));
	  System.out.println(Arrays.toString(g));
	  System.out.println(Arrays.toString(b));*/
	  System.out.println(count-buff);
  }
}