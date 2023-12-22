
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        int a=input.nextInt();
        int b=input.nextInt();
        int diff=0;
        
        for(int i=1;i<1000;i++)
        {
            int p=i*(i+1)/2;
            if(p>=a)
            {
                diff=p-a;
                break;
            }
        
        
        }
        System.out.println(diff);
    }
    
}
