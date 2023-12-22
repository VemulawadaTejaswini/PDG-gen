import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder pattern1 = new StringBuilder();
        StringBuilder pattern2 = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++){
            if(i % 2 == 0){
                pattern1.append("1");
                pattern2.append("0");
            }else{
                pattern1.append("0");
                pattern2.append("1");
            }
        }
        String pattern1_str = pattern1.toString();
        String pattern2_str = pattern2.toString();
        int pat1 =0;
        int pat2 =0;
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == pattern1_str.charAt(i)){
                pat1 += 1;
            }else{
                pat2 += 1;
            }
        }
        if(pat1 >= pat2){
            System.out.println(pat2);
        }else{
            System.out.println(pat1);
        }
    }
}