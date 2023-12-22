import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        String s = stdIn.next();
        char[] a = new char[s.length()];
        for(int i = 0;i<s.length();i++) {
            a[i] = s.charAt(i);
        }
        int cost = calc(a);
        for(int i = 0;i<s.length();i++) {
            for(int j = 0;j<s.length();j++) {
            cost = Math.max(cost,calc(a));
            change2(a,i,j);
            change(a,i,j);
            cost = Math.max(cost,calc(a));
            }
        }
        System.out.println(cost);

    }

    public static void change(char[] a,int b,int c) {
        if(b<c) 
        for(int i = b;i<=c;i++) {
            if(a[i] == 'L') {
                a[i] = 'R';
            } else {
                a[i] = 'L';
            }
        }
    }
    
    public static int calc(char[] a) {
        int cost = 0;
        for(int i = 1;i<a.length-1;i++) {
            if(a[i+1]==a[i]) {
                cost++;
            }
        }
        return cost;
    }
    
    public static void change2(char[] a,int b,int c) {
        if(b<c) {
        int clonec = c;
        for(int i = b;i<=c;i++) {
            char tmp = a[i];
            a[i] = a[clonec];
            a[clonec] = tmp;
            clonec--;
        }
    }
    }
}