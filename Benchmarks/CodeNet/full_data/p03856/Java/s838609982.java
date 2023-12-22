import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String []PARTS = {"dream","dreamer","erase","eraser"};
        boolean flag = true;
        boolean able = true;
        while(flag) {
            flag = false;
            if (input.equals("")) able =true;
            for (int i = 0; i < PARTS.length; i++) {
                if (input.endsWith(PARTS[i])) {
                    input = input.substring(0, input.length() - PARTS[i].length());
                    flag= true;
                }
            }
            if (input.equals("")) able =true;
            else able = false;
        }
        if(able){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        sc.close();

    }

//    private static boolean check(String s){
//        boolean flag = true;
//        while(flag) {
//            flag = false;
//            if (s.equals("")) return true;
//            for (int i = 0; i < PARTS.length; i++) {
//                if (s.endsWith(PARTS[i])) {
//                   s = s.substring(0, s.length() - PARTS[i].length());
//                    flag= true;
//                }
//            }
//        }
//        return false;
//    }

}