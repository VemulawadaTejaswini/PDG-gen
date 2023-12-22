import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int b=0;
        N = sc.nextInt();
        int [] list = new int [N];
        list[0]=11;
        for(int a=12;b<N;a++){
                int num=0;
                    for (int c = 0; c < b; c++) {
                        if (a % list[c] == 0) num++;
                    }
                    if (num == 0 && a%5 ==1) {
                        list[b] = a;
                        b++;
                    }
            }
        for(int a=0;a<N;a++){
            System.out.print(list[a]);
            if(a!=N-1) System.out.print(" ");
        }
         }

}