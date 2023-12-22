import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        int[] a = new int[s.length()];
        int count = 0;
        for (int i=0;i<s.length()-1;i++){
            if (s.charAt(i)==s.charAt(i+1)&&a[i]==0){
                count++;
                a[i+1]++;
            }
        }
        if (s.charAt(0)==s.charAt(s.length()-1)&&a[a.length-1]==0)count++;
        System.out.println(count*(long)k);

    }
}
