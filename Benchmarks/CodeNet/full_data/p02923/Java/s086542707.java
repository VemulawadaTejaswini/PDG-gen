import java.util.Scanner;

public class Main {
    public static boolean debug = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] input = new int[n];
        for(int i=0;i<n;i++){
            input[i] = sc.nextInt();
        }

        int maxcount =0;
        int count= 0;
        for(int i=1;i<n;i++){
            if(input[i-1] >= input[i]){
                count++;
            }else{
                if(maxcount < count){
                    maxcount = count;
                }
                count=0;
            }

        }

        System.out.println(count);



    }
    public static void d(String message){
        if(debug){
            System.out.println(message);
        }
    }


}
