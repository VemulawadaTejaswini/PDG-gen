import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();

        int[] a = new int[100];

        for (int i = 0; i<N; i++){
            a[i] = stdIn.nextInt();
        }
        
        int flag = 0;
        int j;
        for (j=0; j<N; j++){
            if (a[j]%2 == 0) {
                if (a[j]%3 != 0 && a[j]%5 != 0){
                    flag = 1;
                    break;
                }
            }
        }

        if (flag == 1)
            System.out.println("DENIED");
        else
            System.out.println("APPROVED");
        
        //System.out.println("j = "+j);
        

    }
}