
import java.util.Scanner;
public class B_stoneMonument {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        int a=input.nextInt();
        int b=input.nextInt();
        int diff=0;
        
        for(int i=1;i<999;i++)
        {
            int p=i*(i+1)/2;
            if(p>=a)
            {
                diff=p+i+1-b;
                break;
            }
        
        
        }
        
        
        
        
        if(diff<1)
        System.out.println("1");
        else
            System.out.println(diff);
    }
    
}
