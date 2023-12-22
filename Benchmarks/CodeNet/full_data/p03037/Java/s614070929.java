import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int min = n+1;
        int max = 0;
        int l,r;
        for(int i=0;i<m;i++){
            l = Integer.parseInt(sc.next());
            r = Integer.parseInt(sc.next());
            min = Math.min(r,min);
            max = Math.max(l,max);
        }
        if(min-max>=0){
            System.out.println(min-max+1);
        }else{
            System.out.println(0);
        }
    }
}