import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int X=sc.nextInt();
        int l=0;
        for(i=0;i<=A;i++){
            for(j=0;j<=B;j++){
                for(k=0;k<=C;k++){
                    if(X=500*i+100*j+50*k){
                        l++;
                    }
                }
            }
            if(i==A){
                System.out.println(l);
            }
        }
        

        


    }
}
