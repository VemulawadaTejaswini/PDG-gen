import java.util.Scanner;

public class Main {
    static int fact(int n) {
        if (n == 0)
            return 1;

        return n * fact(n - 1);
    }
    int calculateRank(String s){

        int rank = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1 ; j < s.length(); j++) {
                if (s.charAt(i) > s.charAt(j)) {
//                    System.out.println(str.charAt(j));
                    rank = rank + fact(s.length() - (i + 1));
                }
            }
        }
        return rank;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N= sc.nextInt();
        String P=new String();
        String Q=new String();

        for(int i=0;i<N;i++){
            P=sc.next();
        }


        for(int i=0;i<N;i++){
            Q=sc.next();
        }

        Main obj=new Main();

        int j;
        j=obj.calculateRank(P);
        int k;
        k= obj.calculateRank(Q);
        int q=j-k;
        if (q <0)
            q=-1 * q;
        System.out.println(q);

    }
}
