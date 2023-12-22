import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        String S;

        try (Scanner sc = new Scanner(System.in)) {
            S = sc.next();
        }
        boolean out = false;

        int i = 1;
        for(char c : S.toCharArray()){
            if(i %2 == 1){
                if(c == 'L'){
                    out = true;
                    break;
                }
            }else{
                if(c == 'R'){
                    out = true;
                    break;
                }
            }
            i++;
        }
        String result = "";
        if(out){
            result ="No";
        }else{
            result ="Yes";
        }

        System.out.println(result);
    }


}
