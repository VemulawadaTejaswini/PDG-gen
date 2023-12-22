import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner str = new Scanner(System.in);
        int N = str.nextInt();
        int NList[] = new int[N];

        for(int i = 0; i < N; i++){
            NList[i] = str.nextInt();
        }

        Arrays.sort(NList);

        for(int i = 0; i < N - 1; i++){
            if(NList[i] == NList[i + 1]){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
        return;
    }
}