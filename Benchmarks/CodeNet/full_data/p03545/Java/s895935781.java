import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int A = Character.getNumericValue(str.charAt(0));
        int B = Character.getNumericValue(str.charAt(1));
        int C = Character.getNumericValue(str.charAt(2));
        int D = Character.getNumericValue(str.charAt(3));
        
        judge(A,B,C,D);
        
    }
    
    public static void judge(int A,int B,int C,int D){
        if(A+B+C+D==7) System.out.println(A+"+"+B+"+"+C+"+"+D+"=7");
        else if(A+B+C+D==7) System.out.println(A+"+"+B+"+"+C+"+"+D+"=7");
        else if(A+B+C-D==7) System.out.println(A+"+"+B+"+"+C+"-"+D+"=7"); 
        else if(A+B-C+D==7) System.out.println(A+"+"+B+"-"+C+"+"+D+"=7"); 
        else if(A-B+C+D==7) System.out.println(A+"-"+B+"+"+C+"+"+D+"=7"); 
        else if(A+B-C-D==7) System.out.println(A+"+"+B+"-"+C+"-"+D+"=7"); 
        else if(A-B-C+D==7) System.out.println(A+"-"+B+"-"+C+"+"+D+"=7");
        else if(A-B+C-D==7) System.out.println(A+"-"+B+"+"+C+"-"+D+"=7"); 
    }
}