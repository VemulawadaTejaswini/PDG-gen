import java.util.Scanner;

public class Main {
    public static void debug(String str){
        boolean debug = false;
        if(debug != true){
            return;
        }
        System.out.println(str);
    }
    public static void main(String[] args) {

        int N;
        int X;
        int[] listL;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            X = sc.nextInt();
            listL = new int[N];
            for(int i = 0;i < N;i++){
                listL[i] =  sc.nextInt();
            }
        }
        int d = 0;
        int bound = 0;
        for(int l : listL){
            d += l;
            bound++;
            if(d>X){
                break;
            }
        }
        if(d <= X){
            bound++;
        }
        System.out.println(bound);


    }


}
