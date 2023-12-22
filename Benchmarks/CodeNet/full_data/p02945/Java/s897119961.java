import java.util.Scanner;


class Main{

    private static int max(int a,int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int a = A+B;
        int b = A-B;
        int c = A*B;

        int ans = (max(max(a,b),c));

        System.out.println(ans);
    }
}