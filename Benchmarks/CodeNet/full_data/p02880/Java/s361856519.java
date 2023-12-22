import java.util.*;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int checkpoint=0;

        for(int i=1;i < 10;i++){
            double check = (double)n/i;
            if(check == (int)check && check < 10){
                checkpoint++;
            }
        }

        if(0 <checkpoint){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}