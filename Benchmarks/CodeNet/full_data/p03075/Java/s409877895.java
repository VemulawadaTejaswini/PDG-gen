import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        
       Scanner sc = new Scanner(System.in);
       double A = sc.nextInt();
       double B = sc.nextInt();
       double C = sc.nextInt();
       double D = sc.nextInt();
       double E = sc.nextInt();
       
       double AX =Math.ceil(A/10) * 10;
       double BX =Math.ceil(B/10) * 10;
       double CX =Math.ceil(C/10) * 10;
       double DX =Math.ceil(D/10) * 10;
       double EX =Math.ceil(E/10) * 10;
       
       int a=(int)AX -(int)A;
       int b=(int)BX -(int)B;
       int c=(int)CX -(int)C;
       int d=(int)DX -(int)D;
       int e=(int)EX -(int)E;
       
       int [] last = {a,b,c,d,e};
       
       int intMax =last[0];
       int total =(int)AX+(int)BX+(int)CX+(int)DX+(int)EX;
       
       for(int i = 1; i < last.length; i++) {
           if(intMax <= last[i]) {
               intMax = last[i];
               
           }
           
       }
       System.out.println(total-intMax);
       
    
        
    }
    
}