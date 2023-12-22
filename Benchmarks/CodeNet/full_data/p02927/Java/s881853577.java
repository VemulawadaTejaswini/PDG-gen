import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();
        int ans=0;
        for(int i=1;i<=M;i++){
            for(int j=10;j<=D;j++){
                String s = String.valueOf(j);
                int a = Integer.parseInt(s.substring(0, 1));
                                int b = Integer.parseInt(s.substring(1, 2));
                if(a>=2 && b>=2 && a*b==i){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}