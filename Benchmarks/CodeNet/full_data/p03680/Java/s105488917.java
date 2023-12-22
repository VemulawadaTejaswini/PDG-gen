import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int a[]=new int[N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        int count=0;
        int b=0;
        boolean ans=false;
        while(count++<=N){
             b=a[b]-1;
             if(b==1){
                 ans=true;
                 break;
             }
        }
        if(ans==false){
            System.out.println("-1");
        }else{
            System.out.println(count);
        }
    }
}
