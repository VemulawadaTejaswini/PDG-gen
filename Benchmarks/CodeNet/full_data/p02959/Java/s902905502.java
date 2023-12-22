import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        int A[]=new int[N+1];
        for (int i=0;i<N+1;i++){
            A[i]=sc.nextInt();
        }

        int B[]=new int[N];
        for (int i=0;i<N;i++){
            B[i]=sc.nextInt();
        }

        int count = 0;
        for(int i=0; i<N;i++){

            if(A[i]<B[i]){
                //モンスターより勇者が多い
                count=count+B[i];
                A[i+1]=A[i+1]-B[i];
            }else{
                count = count +B[i];
            }
        }
        System.out.println(count);

    }
}
