import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int [] list = new int [S.length()];
        for(int a=0;a<S.length();a++){
            if(S.charAt(a)=='B') list[a]=0;
            else list[a]=1;
        }
        int num=0;
        for(;;){
            int check = 0;
            for(int a=0;a<S.length()-1;a++){
                if (list[a] == 0 && list[a + 1] == 1) {
                    list[a] = 1;
                    list[a + 1] = 0;
                    num++;
                    check=1;
                }
            }
            if(check==0)break;
        }
        System.out.println(num);
    }
}
