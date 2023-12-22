import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arrayA=new int[n];
        int[] arrayB=new int[n];
        for(int i=1;i<=n;i++) {
            int a=sc.nextInt();
            arrayA[i-1]=a;
        }
        for(int i=1;i<=n;i++) {
            int b=sc.nextInt();
            arrayB[i-1]=b;
        }
        int[] arrayP=new int[28];
        int sum=0;
            for(int i=1;i<=n;i++) {
                for(int f=1;f<=n;f++) {
                    int p=arrayA[i-1]+arrayB[f-1];
                    for(int w=27;w>=0;w--) {
                        int a=(int) (p/Math.pow(2,w));
                        arrayP[27-w]+=a;
                        p=(int) (p-Math.pow(2,w)*a);
                    }
                }
            }
            for(int i=27;i>=0;i--) {
                int b=arrayP[27-i]%2;
                
                sum+=b*Math.pow(2,i);
            }
            System.out.println(sum);
            
        
        

    }

}
