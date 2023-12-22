import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int M=scan.nextInt();
        int start=scan.nextInt();
        int[] A=new int[M];
        int i;
        int count1=0;
        int count2=0;
        for(i=0;i<M;i++){
            A[i]=scan.nextInt();
            if(A[i]<start){
                count1++;
            }
            else{
                count2++;
            }
        }
        if(count1<count2){
            System.out.println(count1);
        }
        else{
            System.out.println(count2);
        }
        
    }
}