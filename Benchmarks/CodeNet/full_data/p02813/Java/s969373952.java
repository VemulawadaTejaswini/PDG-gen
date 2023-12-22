import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i=0;i<n;i++){
            p[i] = scanner.nextInt();
        }
        for (int i=0;i<n;i++){
            q[i] = scanner.nextInt();
        }
        ArrayList<Integer> integer1 = new ArrayList<>();
        for (int i=1;i<=n;i++){
            integer1.add(i);
        }
        int count1=0;
        for (int i=0;i<n-1;i++){
            count1 += integer1.indexOf(p[i])*fact(n-i-1);
            integer1.remove((Integer) p[i]);
            Collections.sort(integer1);
        }

        ArrayList<Integer> integer2 = new ArrayList<>();
        for (int i=1;i<=n;i++){
            integer2.add(i);
        }
        int count2=0;
        for (int i=0;i<n-1;i++){
            count2 += integer2.indexOf(q[i])*fact(n-i-1);
            integer2.remove((Integer) q[i]);
            Collections.sort(integer2);
        }

        System.out.println(Math.abs(count1-count2));
    }
    public static int fact(int num){
        int h=1;
        for (int i=1;i<=num;i++){
            h *= i;
        }
        return h;
    }

}