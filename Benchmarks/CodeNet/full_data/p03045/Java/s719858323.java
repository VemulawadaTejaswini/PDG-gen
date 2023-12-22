import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] uf = new int[N];
        Arrays.fill(uf,-1);

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            int z = sc.nextInt();
            if(x>y) {
                int temp = y;
                y = x;
                x = temp;
            }
            int newleader = -1;
            if(uf[x]==-1) {
                newleader = x;
            }else{
                newleader = uf[x];
            }

            uf[y] = newleader;
            for (int j = 0; j < uf.length ; j++) { // rewrite leader to new one
                int leader = uf[j];
                if(leader==y) uf[leader]=newleader;
            }
        }

        int count =0;
        for(int leader : uf) if(leader==-1) count++;
        System.out.println(count);
    }
}