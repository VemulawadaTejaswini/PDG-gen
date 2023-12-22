import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int List [][] = new int [N][D];
        int opt =0;
        for(int i=0;i<N;i++) for(int j=0;j<D;j++)List[i][j]=sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int sum=0;
                for(int k=0;k<D;k++){
                    sum+=Math.pow(List[i][k]-List[j][k],2);
                }
                double num = Math.sqrt(sum);
                if(Math.round(num)==num) opt++;
            }
        }
        System.out.println(opt);
    }
}
