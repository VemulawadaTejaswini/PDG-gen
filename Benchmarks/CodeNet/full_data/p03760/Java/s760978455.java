import java.util.* ; 
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

	
	String s1 = scan.next();
    String s2 = scan.next();
    
    char []c1 = s1.toCharArray();
    char []c2 = s2.toCharArray();
    char[] c3 = new char[c1.length+c2.length];
    int k = 0 ;
    for(int i = 0 ; i< c1.length ; i++){
      c3[k] = c1[i];
      k++;
      if(k==c3.length) break;
      
        c3[k]=c2[i];
      	k++;
      
    }
    String s3 = String.valueOf(c3);
    System.out.println(s3);
  }
}
