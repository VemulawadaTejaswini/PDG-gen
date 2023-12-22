import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
        int c = 0; 
      	String S = sc.next();
      	String[] strls = S.split("");
      	for(int n = N-1;n >= 0;n--){
        	if(strls[n].equals(".") == true && strls[n-1].equals("#") ==true){
            c++;
            }   
        }
        System.out.println(c);   
    }
}