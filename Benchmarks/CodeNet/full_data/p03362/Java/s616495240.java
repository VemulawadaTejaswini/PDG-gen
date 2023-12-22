import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] isNotPrime = new boolean[55555];
        int c = 2;
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        while (c < isNotPrime.length){
            for (int k = c;k < isNotPrime.length;k += c){
                isNotPrime[k] = true;
            }
            isNotPrime[c] = false;
            ++c;
            if(c >= isNotPrime.length){
                break;
            }
            //System.out.println(c);
            while (isNotPrime[c]){
                ++c;
                if(c >= isNotPrime.length){
                    break;
                }
            }
        }
        int now[] = new int[n];
        now[0] = 2;
        int k = 1;
        for (int i = 1;i < n;++i){
            while (true){
                k += 2;
                if(!isNotPrime[k]){
                    now[i] = k;
                    break;
                }
            }
        }
        while (true){
            k += 2;
            if(!isNotPrime[k]){
                break;
            }
        }
        search(n,isNotPrime);
        //sout
    }


    public static void search(int n,boolean[] isNotPrime){
        int[] ret = new int[n];
        ret[0] = 2;
        ret[1] = 11;
        int last = 11;
        for (int i = 2;i < n;++i){
            while (true){
                last += 5;
                if(!isNotPrime[last]){
                    ret[i] = last;
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < ret.length;++i){
            sb.append(ret[i]);
            if(i + 1 != ret.length){
                sb.append(' ');
            }
        }
        System.out.println(sb.toString());
    }







}