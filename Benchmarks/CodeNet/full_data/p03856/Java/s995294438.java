import java.util.Scanner;

public class Main {

    static String []PARTS = {"dream","dreamer","erase","eraser"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if(check(input)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();

    }

    private static boolean check(String s){
        boolean flag = true;
        if(s.equals("")) return flag;
        for(int i=0;i<PARTS.length;i++){
            if(s.endsWith(PARTS[i])){
                return check(s.substring(0,s.length()-PARTS[i].length()));
            }
        }
        return false;
    }

}
