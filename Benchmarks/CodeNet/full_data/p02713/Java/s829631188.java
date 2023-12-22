import java.util.Scanner;
public class Main {
    private static int gcd(int p,int q){
        int temp=p%q;
        while (temp!=0) {
            p = q;
            q = temp;
            temp = p % q;
        }
        return q;
    }

    public static int gcd(int a,int b,int c){
        return gcd(gcd(a,b),c);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();

        int sum=0;
        for(int i=1;i<k+1;i++){
            for(int j=1;j<k+1;j++){
                for(int m=1;m<k+1;m++){
                    sum+=gcd(i,j,m);
                }
            }
        }
        System.out.println(sum);


    }
}
