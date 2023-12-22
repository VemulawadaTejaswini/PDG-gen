import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] Ans = new int[100];

        for(int i = 0; i < n; i++){
           int x1 = stdIn.nextInt();
           int x2 = stdIn.nextInt();
           int x = x1 * x2;

           int cnt = 0;

           for(int j = 1; j > x; j++)
               for(int k = 1; k > x; k++){
                   if(j == x1 || k == x2)
                       continue;
                   if(j * k < x)
                       cnt++;
               }

           Ans[i] = cnt;
        }

        for(int i = 0; i < n; i++)
            System.out.println(Ans[i]);
    }
}