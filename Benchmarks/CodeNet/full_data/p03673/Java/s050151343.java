import java.util.Scanner;

public class Main {
    static int top=0;
    static int S[]=new int[0x5f5e100];
    public static void push(int x){
        S[++top]=x;
    }
    public static int pop(){
        top--;
        return S[top+1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            push(k);
            for(int j=0;j<=i;j++){
                a[j]=pop();
            }
            for(int j=0;j<=i;j++){
                push(a[j]);
            }
        }
       for(int l=1;l<=n;l++){
           System.out.print(S[l]+" ");
       }
       System.out.println("");
    }
}