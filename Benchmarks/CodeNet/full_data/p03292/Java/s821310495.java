import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] A = new int[3];
        Scanner scan = new Scanner(System.in);
        A[0] = Integer.parseInt(scan.next());
        A[1] = Integer.parseInt(scan.next());
        A[2] = Integer.parseInt(scan.next());

        int tmpmin = 101;
        int nummin=0;
        int tmpmax = 0;
        int nummax=0;
        int num=0;
        for(int i = 0;i<3;i++){
            if(tmpmin>=A[i]){
                tmpmin = A[i];
                nummin = i;
            }
            if(tmpmax<A[i]){
                tmpmax=A[i];
                nummax = i;
            }
            if(i!=nummin && i !=nummax){
                num = i;
            }
        }
        int cost = 0;
        cost += A[num]-A[nummin];
        cost+= A[nummax]-A[num];
        System.out.println(cost);
    }
}