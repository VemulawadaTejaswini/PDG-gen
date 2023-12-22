import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int a[]=new int[n];
        int sum=0;
        int arai=0;
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
            sum+=a[i];
        }

        int min=10000000;
        for(int i=0;i<n-1;i++){
            arai+=a[i];
            sum-=a[i];
            if(min>Math.abs(arai-sum)){
                min=Math.abs(arai-sum);
            }
        }

        System.out.println(min);


    }
}