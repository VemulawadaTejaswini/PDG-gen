import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //System.err.println(s);
        boolean flag = true;
        if(s.startsWith("A")) {
            String ns = s.substring(2, s.length()-1);
            int count = 0;
            for(char c : ns.toCharArray()) {
                if(c=='C') {
                    count++;
                }
            }
            if(count!=1) {
                //System.err.println("not 1");
                flag = false;
            }
            for(char c : s.substring(1).toCharArray()) {
                if(c!='C' && !String.valueOf(c).toLowerCase().equals(String.valueOf(c))) {
                    flag = false;
                }
            }
        } else {
            //System.err.println("not A");
            flag = false;
        }
        System.out.println(flag ? "AC" : "WA");
    }
}