import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n;
        int i= 0;
        n= sc.nextInt();
        int sum=0;
        int [] price = new int[n];
        while(i<n)
        {
            price[i] = sc.nextInt();
            i++;
        }
        Arrays.sort(price);
        
        for(i=n-1;i>=0;i--)
        {
            if(i==n-1)
            {
                price[i]=price[n-1]/2;
                
            }
            sum = sum + price[i];  
          
        }
        
        System.out.println(sum);
        
    }

}