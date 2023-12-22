
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[] ints=new int[N];
        for(int i=0;i<N;i++){
            ints[i]= scanner.nextInt();
        }
        int result=0;
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                //System.out.println(String.format("i,j=%d,%d",i,j));
                int sum=0;
                for(int k=i;k<=j;k++){
                    //System.out.print(String.format(" %d, ",ints[k]));
                    sum+=ints[k];
                }
                //System.out.println();
                if(sum==0){
                    result++;
                }
            }
        }
        System.out.println(result);

    }
}
