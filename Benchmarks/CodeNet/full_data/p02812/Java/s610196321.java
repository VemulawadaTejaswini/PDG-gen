import java.util.*;
class Main{
  public static void main(String[] args){
  	int x = 0;
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.nextLine();
    
    for(int i = 0; i <= (N - 2); i++){
    	if( S.charAt(i) == 'a' && S.charAt(i+1) == 'b'){
        	if(S.charAt(i+2) == 'c'){
            	x += 1;
            }
          else;
        }
      else;
    }
    System.out.println(x);
  
  }
}
