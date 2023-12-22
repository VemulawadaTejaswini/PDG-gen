import java.util.Scanner;
     
public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
     
     String O = scan.next();
     String E = scan.next();
     
     char[] o = O.toCharArray();
     char[] e = E.toCharArray();

     for(int i = 0; i < E.length(); i++){
        System.out.print(o[i]);  
        System.out.print(e[i]);  
     }
     if(O.length() != E.length()){
          System.out.print(o[O.length()-1]);  
     }
     System.out.println();  
	}
}
