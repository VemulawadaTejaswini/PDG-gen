import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] u = new int[n-1];
        int[] v= new int[n-1];
        int[] w= new int[n-1];
        int[] color = new int[n];

        for(int i = 0; i < n-1 ; i++){
            u[i] = scanner.nextInt();
            v[i] = scanner.nextInt();
            w[i] = scanner.nextInt();
        }

        for(int i = 0; i < n ; i++){
           color[i] = 0;
        }


        for(int i= 0 ; i < n-1 ; i++){
            if(w[i] % 2 == 0){
                if(color[u[i]-1] == 0 && color[v[i]-1] == 0)
                    color[u[i]-1] = 1;
                    color[u[i]-1] = 1;
            } else {
                if(color[u[i]-1] == color[v[i]-1]) {
                    color[u[i]-1] = (color[u[i]-1] + 1) % 2;
                }
            }
        }

        for(int i = 0; i < n ; i++){
            System.out.println(color[i]);
        }



    }
}