import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int arr[]=new int[n];
        long sum=0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        int minMax=Integer.MIN_VALUE,maxMin=Integer.MAX_VALUE;
        int avg= (int) (sum/n);



        for (int i = 0; i < n; i++) {
            if(arr[i]>=avg)
                maxMin = Math.min(maxMin,arr[i]);

            if(arr[i]<avg)
                minMax = Math.max(minMax,arr[i]);
        }

        
        int countMinMax = 0,countMaxMin=0;

        for (int i = 0; i < n; i++) {
            if(arr[i]>=minMax)
                countMinMax++;

            if(arr[i]>=maxMin)
                countMaxMin++;

        }

        if(countMaxMin*2 == n || countMinMax*2 == n)
            System.out.println(maxMin-minMax);
       else
           System.out.println(0);



    }
}