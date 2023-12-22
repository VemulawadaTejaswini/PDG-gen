import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static int queryCount=0;
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int K=scanner.nextInt();
        int[] ints=new int[N];
        int[] counts=new int[N];
        for(int i=0;i<N;i++){
            ints[i]=scanner.nextInt();
            counts[ints[i]-1]++;
        }
        int kind=0;
        for(int i=0;i<N;i++){
            if(counts[i]>0) kind++;
        }
        int result=0;
        while (kind>K){
            /*
            System.out.println("count=");
            Arrays.stream(counts).forEach(i->{
                System.out.print(i+",");
            });
            System.out.println();*/
            int min=Integer.MAX_VALUE;
            int index=0;
            for(int i=0;i<N;i++){
                if(min>counts[i]&&counts[i]!=0){
                    min=counts[i];
                    index=i;
                }
            }
            counts[index]=0;
            kind--;
            result+=min;
        }
        System.out.println(result);
    }
}
