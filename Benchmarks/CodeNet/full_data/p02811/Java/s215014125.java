import java.util.*;
class Main{
  public static void main(String[] args){
  	int x = 0;
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.nextLine();
    
    for(int i = 0; i <= (N - 2); i++){
    	if( S.charAt(i).equals("a") && S.charAt(i).equals("b")){
        	if(S.charAt(i).equals("c")){
            	x += 1;
            }
        }
    }
    System.out.println(x);
  
  }
}
