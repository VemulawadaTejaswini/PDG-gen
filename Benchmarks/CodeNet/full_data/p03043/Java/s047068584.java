
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        double ans=0;

        for(int i=1;i<=n;i++){
            int kakuritu=n;
            int score=i;
            while(score<k){
                score*=2;
                kakuritu*=2;
            }
            ans+=1/(double)kakuritu;
        }

        System.out.println(ans);

    }
}