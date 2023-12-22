import java.util.*;
import java.io.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();


 
            HashMap<Long,Integer> m = new HashMap<>();
            long now = a;
            boolean ok = true;
            long pre = -1;

            while(true) {
                if(b > d) {
                    ok = false;
                    break;
                }
                if(now < b) {
                    ok = false;
                    break;
                }
                if(m.containsKey(now)) break;
                m.put(now, 1);
                if(now % b <= c) {

                    now %= b;
                    if(pre != -1) {
                        long tmp = now - pre;
                        long tt1 = c - tmp;
                        long tt2 = c;
                        long tt3 = c + tmp;
                        if(tt1 + d - b >= 0 && tt1 + d - b + d - b >= 0) {
                            ok = true;
                        } else {
                            ok = false;
                            break;
                        }
                        if(tt2 + d - b >= 0 && tt2 + d - b + d - b >= 0) {
                            ok = true;
                        } else {
                            ok = false;
                            break;
                        }
                        if(tt2 + d - b >= 0 && tt2 + d - b + d - b >= 0) {
                            ok = true;
                        } else {
                            ok = false;
                            break;
                        }

                        //System.out.println(a + " " + b + " " + c + " " + d + " " + now + " " + tmp);
                    }


                    pre = now;

                    now += d;



                } else {
                    now = now % b;
                }
            }
            if(ok) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
 
        }
    }
}