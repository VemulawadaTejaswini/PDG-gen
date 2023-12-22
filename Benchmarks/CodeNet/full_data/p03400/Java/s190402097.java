import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();
        int[] d = new int[a];
        for(int i = 0;i<a; i++){
            d[i] = sc.nextInt();
            sc.nextLine();
        }
        int count = c;
        for(int i = 0;i<a;i++){
            count += (b+d[i]-1)/d[i]; 
        }
        System.out.println(count);
    }
}