import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main m = new Main();
        m.q3();

    }

    void q3()
    {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        int[] a = new int[N-1];
        int[] answer = new int[N];
        for(int i = 0; i < N;i++)
        {
            answer[i] = 0;
        }

        for(int i = 0 ; i < N-1;i++)
        {
            answer[Integer.parseInt(scan.next()) - 1] += 1;
        }

        for(int i = 0; i < N; i++){
            System.out.println(answer[i]);
        }
    }


}
