import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    String s = "";
    for(int i=0;i<h;i++) {
    	for(int j=0;j<w;j++) {
    		if((i<b)^(j<a)) {
    			s = s+"1";
    		}else {
    			s = s+"0";
    		}
    	}
    	s = s+"\n";
    }
    System.out.println(s);
    
  }
}