import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner in=new Scanner(System.in);
      	String S=in.next();
      	String res="Yes";
      	for(int i=0;i<S.length();i++){
        	if( (i+1)%2==1 && S.charAt(i)=='L' ){
            	res="No";
              	break;
            }
           	else if( (i+1)%2==0 && S.charAt(i)=='R' ){
            	res="No";
              	break;
            }
        }
        System.out.println(res);
        in.close();
    }      
}