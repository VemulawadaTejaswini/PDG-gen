import java.util.*;

public class Main {
    public static int map[][]=new int[11][11];
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int R=sc.nextInt();

        int temp=0;
        int ans=987654321;



        for(int i=L;i<R;i++){
            for(int j=i+1;j<=R;j++){

                temp=((i%2019)*(j%2019))%2019;

                ans=Math.min(ans,temp);
            }

        }

        System.out.println(ans);
    }


}