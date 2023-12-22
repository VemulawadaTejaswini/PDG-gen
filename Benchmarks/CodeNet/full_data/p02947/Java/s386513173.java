import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for (int i=0; i<n; i++) s[i] = sc.next();

        int count = 0;

        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (comp(s[i], s[j])){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    public static boolean comp(String s1, String s2){
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.equals(c1, c2)){
            return true;
        }else{
            return false;
        }
    }


}