import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int re = 0;
        for(int i=0;i<n;i++){
            if(sc.nextInt()>=k)re++;
        }
        System.out.println(re);
    }
}
