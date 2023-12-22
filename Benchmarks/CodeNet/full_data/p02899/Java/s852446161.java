import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        int n = sc.nextInt();
        int[] a = new int[n];
        for(i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        a = new Main().go_to_school(n, a);
        for(i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }

    }

    public int[] go_to_school(int n, int[] a){
        int j = 0;
        int[] b = new int[n];
        for(int i = 1; i < n + 1; i++){
            for(j = 0; j < n; j++){
                if(a[j] == i){
                    b[i - 1] = j + 1;
                    break;
                }
            }
        }
        return b;
    }
}
