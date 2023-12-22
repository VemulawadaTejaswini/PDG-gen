import java.util.Scanner;
class Main{

    public static int N;
    private static int parent(int k){
        return (k+(N-2))/N;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        int Q = scan.nextInt();
        while(Q-->0){
            int u = scan.nextInt();
            int v = scan.nextInt();
            int cnt = 0;
            while(u != v){
                if(u > v)u = parent(u);
                else v = parent(v);
            }
            System.out.println(u);
        }
    }
}