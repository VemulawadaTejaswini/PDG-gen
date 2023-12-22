import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = judge(sc.next());
        int b = judge(sc.next());
        if(a*b==1){
            System.out.println("H");
        }else{
            System.out.println("D");
        }
    }
    static int judge(String S){
        if("H".equals(S)){
            return 1;
        }else{
            return -1;
        }
    }
}
