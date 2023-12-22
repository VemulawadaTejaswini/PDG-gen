import java.util.Scanner;

public class Main{

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = sc.next();
        s = s.toLowerCase();
        String needle = "keyence";
        int needlecounter = 0;
        for(int i = 0; i< s.length(); ++i) {
            String temp = s.substring(i, i+1);
            String needlesub = needle.substring(needlecounter, needlecounter+1);
            //System.out.println(temp);
            //System.out.println(needlesub);
            if(temp.equals(needlesub)) {
                ++needlecounter; 
            }
        }
        //System.out.println(needlecounter+" "+needle.length());
        if(needlecounter == needle.length()) {
            System.out.println("YES");    
        }else {
            System.out.println("NO");
        }
    }

}
