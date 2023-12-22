import java.util.Scanner;

public class Main {
    public static boolean debug = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] input = new int[n-1];

        int sum = 0;

        for(int i=0; i<n-1;i++){
            input[i] = sc.nextInt();
        }

        if(n==2){
            System.out.println(input[0]*2);
            return;
        }


        int before = 0;
        for(int i=n-2; i>=0;i--){
            //d("input[" + i + "]=" + input[i]);
            if(i == n-2){
                sum += input[i];
                before = input[i];
            }else if(i !=0){
                sum += Math.min(input[i],before);
                before = input[i];
            }else{
                sum += Math.min(input[i],before);
                sum += input[i];
            }

        }

        System.out.println(sum);
        /*
        0 153 10 10 23
        0 0   10 10 10 23

        2 5
        2 2 5

        3
        3  3
         */


    }

    public static void d(String message){
        if(debug){
            System.out.println(message);
        }
    }
}