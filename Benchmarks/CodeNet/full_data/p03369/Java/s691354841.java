import java.util.Scanner;
import java.math.*;

class Main {
    public static void main(String[] args){
    	 Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         int inP = 700;
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='o'){
                inP+=100;
            }else{
                continue;
            }
         }
         System.out.println(inP);
    }    
}