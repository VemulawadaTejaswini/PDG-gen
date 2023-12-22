import java.util.Scanner;
public class RatedForMe
{
    public static void main(String args[]){
        Scanner R = new Scanner(System.in);
        int rate = R.nextInt();
        if(rate >= 0 && rate < 1200){
            System.out.println("ABC");
        }
        else if (rate >= 1200 && rate < 2800){
            System.out.println("ARC");
        }
        else if (rate >= 2800){
            System.out.println("AGC");
        }
        
    }
    
}
