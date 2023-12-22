
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=1; i<=3;i++)
            if(i==1){
                sum=a+b;
            }else if(sum<=a-b){
                sum=a-b;
            }else if(sum<=a*b){
                sum=a*b;
        }
        System.out.println(sum);
    }
    
}
