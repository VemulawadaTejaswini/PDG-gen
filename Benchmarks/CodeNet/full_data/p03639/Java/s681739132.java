import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner re=new Scanner(System.in);
        int h=re.nextInt();
        int w=re.nextInt();
        int num=re.nextInt();
        int x;
        int count=0;
        int[] A=new int[h*w];
        for(int i=1;i<=num;i++){
            x=re.nextInt();
            for(int j=count;j<count+x;j++){
                A[j]=i;
            }
            count+=x;
        }
        for(int i=0;i<h*w;i++){
            System.out.print(A[i]);
        }
        System.out.print("\n");
        for(int i=0;i<h/2;i++){
            for(int j=0;j<w;j++){
                System.out.print(A[i*2*w+j]);
            }
            System.out.println();
            for(int j=0;j<w;j++){
                System.out.print(A[i*2*w+2*w-1-j]);
            }
        }
        if(h%2!=0){
            System.out.println();
            for(int i=h*w-w;i<h*w;i++){
                System.out.print(A[i]);
            }
        }
    }
}
