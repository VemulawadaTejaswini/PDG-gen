import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N=sc.nextInt();
        int M=sc.nextInt();

        ArrayList<Integer>[] A=new ArrayList[N];
        int[] B=new int[N];
        for(int i=0;i<N;i++){
            A[i]=new ArrayList<>();
            B[i]=0;
        }
        for(int i=0;i<M;i++){
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            A[a].add(b);
            A[b].add(a);
        }
        if(M%2==1){
            System.out.println(-1);
            return;
        }
        StringBuilder br=new StringBuilder();
        for(int j=0;j<N;j++){
            while(A[j].size()>1){
                if(B[A[j].get(0)]%2==1){
                    B[A[j].get(0)]++;
                    br.append(A[j].get(0) + 1);
                    br.append(" ");
                    br.append(j + 1);
                    br.append("\n");

                }else{
                    B[j]++;
                    br.append(j + 1);
                    br.append(" ");
                    br.append(A[j].get(0) + 1);
                    br.append("\n");

                }
                A[A[j].get(0)].remove(Integer.valueOf(j));
                A[j].remove(0);
            }
        }
        for (int i = 0; i < N; i++) {
            if (A[i].size() == 1) {
                A[A[i].get(0)].remove(Integer.valueOf(i));
                if (B[i] % 2 == 0) {
                    B[A[i].get(0)]++;
                    br.append(A[i].get(0)+1);
                    br.append(" ");
                    br.append(i+1);
                    br.append("\n");
                } else {
                    br.append(i+1);
                    br.append(" ");
                    br.append(A[i].get(0)+1);
                    br.append("\n");
                }
                A[i].remove(0);
            }
        }



       System.out.println(br.toString());


}
}
