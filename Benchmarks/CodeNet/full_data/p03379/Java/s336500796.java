import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;
        N=sc.nextInt();
        int [] X = new int[N];
        int [] num2 = new int[N];
        ArrayList<Integer> X2 = new ArrayList<>();

        for(int a=0;a<N;a++){
            X[a] =sc.nextInt();
            X2.add(X[a]);
        }
        for(int a=0;a<N;a++){
            X2.remove(a);
            Collections.sort(X2);
            num2[a] = X2.get((N/2)-1);
            X2.clear();
            for(int b=0;b<N;b++){
                X2.add(X[b]);
            }
        }
        for(int a=0;a<N;a++) System.out.println(num2[a]);
   }
}