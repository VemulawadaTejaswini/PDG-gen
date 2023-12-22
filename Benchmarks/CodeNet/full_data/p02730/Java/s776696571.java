import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        int n = s.length;
        String[] s1 = new String[n/2];
        String[] s2 = new String[n/2];
        for(int i=0;i<(n-1)/2;i++){
            s1[i] = s[i];
        }
        for(int i=(n+3)/2-1;i<n;i++){
            s2[i-(n+3)/2+1] = s[i];
        }
        if(check(s1) && check(s2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static boolean check(String[] a){
        int n = a.length/2;
        for(int i=0;i<n;i++){
            if(!a[i].equals(a[a.length-1-i])){
                return false;
            }
        }
        return true;
    }
}
