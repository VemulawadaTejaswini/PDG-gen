
import java.security.SecureRandom;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new SecureRandom();
        int n = sc.nextInt();
        int n2 = n*2;
        boolean[] h = new boolean[n2];
        int[] res = new int[n];
        String q0 = "";
        
        while(true) {
            boolean[] b = new boolean[n2];
            for(int i=0; i<n-1; i++) {
                while(true) {
                    int a = r.nextInt(n2);
                    if (!b[a]) {
                        b[a] = true;
                        break;
                    }
                }
            }
            int a1 = -1;
            int a2 = -1;
            while(true) {
                int a = r.nextInt(n2);
                if (!b[a]) {
                    a1 = a;
                    break;
                }
            }
            while(true) {
                int a = r.nextInt(n2);
                if (!b[a] && a != a1) {
                    a2 = a;
                    break;
                }
            }
            StringBuilder q = new StringBuilder();
            q.append("?");
            for(int i=0; i<n2; i++) {
                if(b[i]) {
                    q.append(" ");
                    q.append(i);
                }
            }
            q.append(" ");
            q0 = q.toString();
            String q1 = q0 + a1;
            String q2 = q0 + a2;

            System.out.println(q1);
            System.out.flush();
            String r1 = sc.next();
            System.out.println(q2);
            System.out.flush();
            String r2 = sc.next();

            if(!r1.equals(r2)) {
                if(r1.equals("Red")) {
                    res[a1] = 1;
                    res[a2] = -1;
                } else {
                    res[a1] = -1;
                    res[a2] = 1;
                }
                h = b;
                break;
            }
        }

        int rc = 0;
        int bc = 0;
        StringBuilder q20 = new StringBuilder();
        q20.append("?");
        for(int i=0; i<n2; i++) {
            if(!h[i] && res[i]==0) {
                String q = q0 + ' ' + i;
                System.out.println(q);
                System.out.flush();
                String qr = sc.next();
                if(qr.equals("Red")) {
                    res[i] = 1;
                    if(rc < (n - 1)/2) {
                        q20.append(" " + i);
                        rc++;
                    }
                } else {
                    res[i] = -1;
                    if(bc < (n - 1)/2) {
                        q20.append(" " + i);
                        bc++;
                    }
                }
            }
        }
        String qq = q20.toString() + " ";
        for(int i=0; i<n2; i++) {
            if(res[i]==0) {
                String q = qq + i;
                System.out.println(q);
                System.out.flush();
                String qr = sc.next();
                if(qr.equals("Red")) {
                    res[i] = 1;
                } else {
                    res[i] = -1;
                }
            }
        }
        
        StringBuilder q30 = new StringBuilder();
        q30.append("! ");
        for(int i=0; i<n2; i++) {
            if(res[i] == 1) {
                q30.append('R');
            } else {
                q30.append('B');
            }
        }
        System.out.println(q30.toString());


    }


}
