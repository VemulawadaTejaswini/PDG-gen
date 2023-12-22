import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] a = new int[N];
        int i = 0;
        while(i < N){
            a[i] = sc.nextInt();
            i++;
        }
        int j = 1;
        boolean flag = false;
        while(true){
            double div = Math.pow(2, j);
            for(int c: a){
                if(c % div != 0){
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
            j++;
        }
        System.out.println(j - 1);
    }
}
