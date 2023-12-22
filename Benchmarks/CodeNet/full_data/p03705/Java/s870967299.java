import java.util.Scanner;

/**
 * Created by DELL on 2017/5/27.
 */
 class _1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int A=input.nextInt();
        int B=input.nextInt();
        if(N<1) System.out.println(0);
        else if((N==1&&(A!=B))||A>B) System.out.println(0);
        else if(A==B) System.out.println(1);
        else System.out.println(B*(N-1)+A-(A*(N-1)+B)+1);




    }
}
