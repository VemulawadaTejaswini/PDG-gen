import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        sc.nextLine();

        int p[]=new int[N];
        for (int i=0;i<N;i++){
            p[i]=sc.nextInt();
        }
        int count=0;

        for (int i=0; i<N;i++){
            if (p[i] != i+1){
                count++;
            }
        }
        if (count==0||count==2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }




}
