import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int num = 0;
        for(int i=0;i<M;i++){
            num+=scan.nextInt();
        }
        System.out.println((N<=num)?"Yes":"No");
    }
}
