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
            int count = 0;

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
                        if(tmp >= 0) {

                            
                            long chk3 = tt1 - b + d;
                            if(chk3 <= c) {
                                chk3 += d;
                            }
                            if(chk3 - b < 0) {
                                ok = false;
                                break;
                            }
                            chk3 -= b;
                            if(chk3 <= c) {
                                chk3 += d;
                            }
                            if(chk3 - b < 0) {
                                ok = false;
                                break;
                            }
                            
                            

                            chk3 = tt2 - b;
                            if(chk3 <= c) {
                                chk3 += d;
                            }
                            if(chk3 - b < 0) {
                                ok = false;
                                break;
                            }
                            chk3 -= b;
                            if(chk3 <= c) {
                                chk3 += d;
                            }
                            if(chk3 - b < 0) {
                                ok = false;
                                break;
                            }


                            chk3 = tt3 - b;
                            if(chk3 <= c) {
                                chk3 += d;
                            }

                            if(chk3 - b < 0) {
                                ok = false;
                                break;
                            }
                            chk3 -= b;
                            if(chk3 <= c) {
                                chk3 += d;
                            }
                            if(chk3 - b < 0) {
                                ok = false;
                                break;
                            }
                        
                            if(count == 5000) {
                                ok = true;
                                break;
                            }
                            count++;

                            
                        }
                        


                        
                        


                    }


                    pre = now;

                    now += d;



                } else {
                    now = now % b;
                }

                //System.out.println(a + " " + b + " " + c + " " + d + " " + " " + now + " ");
                //System.out.println(now);
            }
            if(ok) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
 
        }
    }
}