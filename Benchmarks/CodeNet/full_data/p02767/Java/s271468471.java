import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        int X[] = new int[N];
        int min = 100;
        int max = 0;

        for(int i=0;i<N;i++){
            X[i] = sc.nextInt();
            if(max < X[i])max = X[i];
            if(min > X[i])min = X[i];
        }
        sc.nextLine();

        double hp_all[] = new double[max - min];
        double hp_min = 1000000;
        for(int i=min;i<max;i++){
            for(int j=0;j<N;j++){
                hp_all[i-min] += Math.pow(X[j] - i, 2);
            }
            if(hp_min > hp_all[i-min])hp_min = hp_all[i-min];
        }
        System.out.println((int)hp_min);
    }
}