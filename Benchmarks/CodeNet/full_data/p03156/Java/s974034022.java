import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++) p[i] = scan.nextInt();
        int pa = 0;
        int pb = 0;
        int pc = 0;
        for(int i = 0; i < n; i++){
            if(p[i] <= a) pa++;
            else if(p[i] <= b) pb++;
            else pc++;
        }
        System.out.println(Math.min(Math.min(pa, pb), pc));
        scan.close();
    }
}
