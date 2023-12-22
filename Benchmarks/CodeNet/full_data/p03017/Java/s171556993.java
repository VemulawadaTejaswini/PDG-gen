import java.util.*;

class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt()-1;
        int B = sc.nextInt()-1;
        int C = sc.nextInt()-1;
        int D = sc.nextInt()-1;
        String[] str = sc.next().split("");
        int[] map = new int[N];
        for(int i=0;i<N;i++){
            if(str[i].equals("#")){
                map[i] = 1;
            }
        }

        if(C > D){
            for(int i=A;i<C-1;i++){
                if(map[i]==1 && map[i+1]==1){
                    System.out.println("No");
                    return;
                }
            }
            for(int i=B;i<D-2;i++){
                if(map[i]==0 && map[i+1]==0 && map[i+2]==0){
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
        }
        else{
            for(int i=A;i<D-1;i++){
                if(map[i]==1 && map[i+1]==1){
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
    }

    public static void dump(int[] a) {
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
        return;
    }
}