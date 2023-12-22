import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
      
         Scanner entrada=new Scanner(System.in);
         int count=0;
         String S=entrada.next();
        int [] x =new int[4];
        
        
       
        for (int i = 0; i <4; i++) {
            x[i]=S.charAt(i);
            
        }
        
        Arrays.sort(x);
        for (int i = 0; i < 3; i++) {
            if(x[i]==x[i+1]){
                count++;
            }
            
        }
       
        if(x[0]==x[1]&&x[2]==x[3]&& count!=3){
            System.out.println("Yes");
        }else if(count==3 || (x[0]!=x[1]&&x[2]!=x[3])||(x[0]==x[1]&&x[2]!=x[3]) ||x[0]!=x[1]&&x[2]==x[3]  ){
            System.out.println("No");
        }
        
    }
    
}
