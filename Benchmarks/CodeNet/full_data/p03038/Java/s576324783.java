import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Pair bc[] = new Pair[M];
        for(int i=0; i<M; i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            bc[i] = new Pair(c,b);
        }

        Arrays.sort(bc);
        long sum = 0;
        int i=0;
            for(int j=0; j<M && i<N; j++){
                for(int k=0; k<bc[j].second && i<N;k++){
                    int c = bc[j].first;
                    if(A[i] < c){
                        sum += c;
                    } else {
                        sum += A[i];
                    }
                    i++;
                }
            }
        for(int j=i; j<N; j++) {
            sum += A[j];
        }


        System.out.println(sum);
    }
}

//import java.util.*;
//import java.util.*;

class Pair implements Comparable<Pair>{
    //firstが検索対象
    public int first;
    public int second;
    Pair(int a, int b) {
        this.first = a;
        this.second = b;
    }

    public int compareTo(Pair pair) {
        //降順なら上１，下−１
        //昇順なら上−１，下１
        if (this.first < pair.first) return 1;
        if (this.first > pair.first) return -1;
        return 0;
    }
}


