import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int N2=N;
        int[] order=new int[10];
        int i=0;
        int answer=0;
        while(N!=0){
            order[i]=N%10;
            answer+=order[i];
            N/=10;
        }
        if(N2%answer==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}