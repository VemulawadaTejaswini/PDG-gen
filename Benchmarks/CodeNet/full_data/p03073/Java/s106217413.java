import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int n = s.length();
        int count = 0;
        for (int i=0; i<n-1; i++){
            i = 0;
            if ((s.charAt(i)=='0') & (s.charAt(i+1)=='0')){
                s = s.substring(i+1);
                s.replaceFirst("0", "1");
                count++;
            }
            else if ((s.charAt(i)=='1') & (s.charAt(i+1)=='1')){
                s = s.substring(i+1);
                s.replaceFirst("1", "0");
                count++;
            }
            else if ((s.charAt(i)=='0') & (s.charAt(i+1)=='1')){
                s = s.substring(i+1);
            }
            else if ((s.charAt(i)=='1') & (s.charAt(i+1)=='0')){
                s = s.substring(i+1);
            }
            n -= 1;
        }
        System.out.println(count);
//        if (n/2 < count){
//            System.out.print(n-count);
//        }else{
//            System.out.print(count);
//        }
    }
}


