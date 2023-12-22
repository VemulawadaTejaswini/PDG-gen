import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int countC = 0;
        int count = 0;
        
        if(str.charAt(0) == 'A' && !Character.isUpperCase(str.charAt(1))){
            //System.out.println("test");
            for(int i=2; i<str.length()-1; i++){
                if(str.charAt(i) == 'C'){
                    countC++;
                   //System.out.println("test1");
                }
                if(Character.isUpperCase(str.charAt(i))){
                    count++;
                    //System.out.println("test2");
                }
                if(countC > 1 || count >1){
                    //System.out.println("test3");
                    break;
                }
            }
        }else{
            
        }
        
        if(countC==1 && !Character.isUpperCase(str.charAt(str.length()-1))){
            System.out.println("AC");
        }else{
            System.out.println("WA");
        }
    }
}
