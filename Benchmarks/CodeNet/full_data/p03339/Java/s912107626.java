import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        int min = 30000;
        int[] integer1 = new int[n+1];
        int[] integer2 = new int[n+1];
        integer1[0]=0;
        integer2[0]=0;
        for (int i=0;i<n;i++){
            if (str.charAt(i)=='W'){
                integer1[i+1]=integer1[i]+1;
                integer2[i+1]=integer2[i];
            }else {
                integer2[i+1]=integer2[i]+1;
                integer1[i+1]=integer1[i];
            }
        }
        for (int i=0;i<n;i++){
            min = Math.min(min,integer1[i]-integer1[0]+integer2[n]-integer2[i+1]);
        }
        System.out.println(min);
    }
}
