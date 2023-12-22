import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        int len = in.length();
        if(len % 2 == 0){
            char[] test = in.substring(0,in.length() / 2).toCharArray();
            char[] test2 = in.substring(in.length() / 2).toCharArray();
            List<Character> testRev = new ArrayList<Character>();
            for(char each : test){
                testRev.add(each);
            }
            Collections.reverse(testRev);
            List<Character> testRev2 = new ArrayList<Character>();
            for(char each : test2){
                testRev2.add(each);
            }
            Collections.reverse(testRev2);
            int cur = 0;
            int r = 0;
            for(char c : test){
                if(c != testRev2.get(cur)){
                    r++;
                }
                cur++;
            }
            cur = 0;
            int r1 = 0;
            for(char c : test2){
                if(c != testRev.get(cur)){
                    r1++;
                }
                cur++;
            }
            System.out.println(Math.min(r,r1));
        }else{
            char[] test = in.substring(0,in.length() / 2).toCharArray();
            char[] test2 = in.substring(in.length() / 2 + 1).toCharArray();
            List<Character> testRev = new ArrayList<Character>();
            for(char each : test){
                testRev.add(each);
            }
            Collections.reverse(testRev);
            List<Character> testRev2 = new ArrayList<Character>();
            for(char each : test2){
                testRev2.add(each);
            }
            Collections.reverse(testRev2);
            int cur = 0;
            int r = 0;
            for(char c : test){
                if(c != testRev2.get(cur)){
                    r++;
                }
                cur++;
            }
            cur = 0;
            int r1 = 0;
            for(char c : test2){
                if(c != testRev.get(cur)){
                    r1++;
                }
                cur++;
            }
            System.out.println(Math.min(r,r1));
        }
    }
}