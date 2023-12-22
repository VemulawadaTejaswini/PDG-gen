import java.util.*;
 
class Main {
static Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args){
	String S = scan.next();
	long K = scan.nextLong();
    int oneCount = 0;
    String ans = null;
    for(int i = 0; i < S.length();i++){
    	if("1".equals(S.substring(i,(i+1)))){
          oneCount += 1;
          continue;
        }
      break;
  	}
    
    if(oneCount >= K){ans = "1";}
    else{ ans = S.substring(oneCount,(oneCount+1));}
    
    System.out.println(ans);
  }
}
