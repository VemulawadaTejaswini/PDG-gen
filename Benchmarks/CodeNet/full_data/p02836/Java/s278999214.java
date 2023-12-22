import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        int len = in.length() / 2;
        String test = in.substring(0,len);
        String test2 = in.substring(len);
        int testCur = test.length() - 1;
        int r1 = 0;
        for(char c : test2.toCharArray()){
            if(c != test.toCharArray()[testCur]){
                r1++;
            }
            testCur--;
            if(testCur == -1){
                break;
            }
        }
        int r2 = 0;
        testCur = test2.length() - 1;
        for(char c : test.toCharArray()){
            if(c != test2.toCharArray()[testCur]){
                r2++;
            }
            testCur--;
            if(testCur == -1){
                break;
            }
        }
        System.out.println(Math.min(r2, r1));
    }
}