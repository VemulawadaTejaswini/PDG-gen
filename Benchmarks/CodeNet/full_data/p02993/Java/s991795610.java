
import java.util.Scanner;

class Main {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char []S;
        int count=0;
        S=input.next().toCharArray();
        for(int i=0;i<3;i++)
        {
                if(S[i]==S[i+1])
                {
                    System.out.println("Bad");
                    count++;
                    break;
                }
            
        }
        if(count==0)
        {
            System.out.println("Good");
        }    
     }
        
}
