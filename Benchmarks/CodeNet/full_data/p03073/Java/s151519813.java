import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int n = s.length();
        int count = 0;
//        for (int i=0; i<n-1; i++){
//            i = 0;
//            if ((s.charAt(i)=='0') & (s.charAt(i+1)=='0')){
//                s = s.substring(i+1);
//                s.replaceFirst("0", "1");
//                count++;
//            }
//            else if ((s.charAt(i)=='1') & (s.charAt(i+1)=='1')){
//                s = s.substring(i+1);
//                s.replaceFirst("1", "0");
//                count++;
//            }
//            else if ((s.charAt(i)=='0') & (s.charAt(i+1)=='1')){
//                s = s.substring(i+1);
//            }
//            else if ((s.charAt(i)=='1') & (s.charAt(i+1)=='0')){
//                s = s.substring(i+1);
//            }
//            n -= 1;
//        }
//        System.out.println(count);

        String bw[] = new String[n];
        String wb[] = new String[n];
        int bw_count = 0;
        int wb_count = 0;

        for (int i=0; i*2<n; i++){
            bw[i*2] = "0";
            wb[i*2] = "1";
        }
        for (int i=1; i*2<n+1; i++){
            bw[i*2-1] = "1";
            wb[i*2-1] = "0";
        }

        for (int i=0; i<n; i++){
            if (!String.valueOf(s.charAt(i)).equals(bw[i])){
                bw_count++;
            }
        }
        for (int i=0; i<n; i++){
            if (!String.valueOf(s.charAt(i)).equals((wb[i]))){
                wb_count++;
            }
        }

        if (bw_count<wb_count)  System.out.println(bw_count);
        else System.out.println(wb_count);
    }
}


