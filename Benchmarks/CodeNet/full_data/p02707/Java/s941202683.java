import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        String[] Am = (scn.nextLine()).split(" ");
        Am = (scn.nextLine()).split(" ");
        int[] Aresult = new int[N];
        int A = 0;
        for(int i=0;i<N-1;i++){
            A = Integer.valueOf(Am[i])-1;
            Aresult[A] = Aresult[A] + 1;
        }
        for(int i=0;i<N;i++){
            System.out.println(Aresult[i]);
        }
    }
}