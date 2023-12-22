import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    int count=0;
    for(int i=0;i<s.length()-1;i++) {
    	for(int j=i+1;j<=s.length();j++) {
    		double buff=Double.valueOf(s.substring(i, j));
    		if(buff%2019==0) {
    			count++;
    			//System.out.println(i+" "+j+" :"+buff);
    		}
    		//System.out.println(buff);
    	}
    }
    System.out.println(count);
  }
}
