import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int [][] List = new int[10][10];
        for(int i=0;i<10;i++)for(int j=0;j<10;j++) List[i][j]=0;
        for(int i=1;i<=N;i++){
            int [] Pair = F(i);
            List[Pair[1]][Pair[0]]++;
        }
        for(int i=1;i<=N;i++){
            if(i%10!=0){
                int [] Pair = F(i);
                sum+=List[Pair[0]][Pair[1]];
            }
        }
        System.out.println(sum);

    }
    public static int[] F(int i){
        int [] List = new int [2];
        List[0]= i%10;
        List[1] = 0;
       while(i!=0){
           List[1] = i;
           i/=10;
       }
       return List;
    }
}