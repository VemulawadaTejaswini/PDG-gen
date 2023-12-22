import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = (1<<n);

        int diff = 0;
        for(int i=0; i<n; i++) {
            if((a>>i)%2 != (b>>i)%2) diff++;
        }

        if(diff == 1) {
            System.out.println("YES");
            for(int i=0; i<m; i++) {
                if(i>0)System.out.print(" ");
                System.out.print(i ^ (i>>1) ^ a);
            }
            System.out.println();
        } else {
            System.out.println("NO");
        }

    }


}
