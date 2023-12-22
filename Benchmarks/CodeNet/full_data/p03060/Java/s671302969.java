import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] ara1 = new int[n];
        int[] ara2 = new int[n];

        ArrayList<Integer> diff = new ArrayList<>();

        for(int i=0;i<n;i++){
            ara1[i] = scanner.nextInt();
        }

        for(int i=0;i<n;i++){
            ara2[i] = scanner.nextInt();
            //diff.add(ara2[i] - ara1[i]);
        }


        int sum=0;

        for(int i=0;i<n;i++){
            if(ara1[i]>ara2[i]){
                sum+=ara1[i]-ara2[i];
            }
        }

        prln(sum);


    }

    public static void prln(Object line){
        System.out.println(line);
    }

    public static void pr(Object line){
        System.out.print(line);
    }

}
