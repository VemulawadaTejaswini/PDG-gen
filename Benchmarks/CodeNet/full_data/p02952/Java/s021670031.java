import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        int n = Integer.parseInt(str);
        sc.close();
        int flag =0;
        for(int i=1;i<=n;i++){
            flag += check(Integer.toString(i));
        }
        System.out.println(flag);
    }

    public static int check(String a){
        String[] tmp = a.split("");
        if(tmp.length %2 == 0){
            return  0;
        }
        else{
            return 1;
        }
    }
}