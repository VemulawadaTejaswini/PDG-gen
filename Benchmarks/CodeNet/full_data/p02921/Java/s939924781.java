import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        String[] astr = str.split(""); //状況に合わせて
        String str2  = sc.nextLine();
        String[] astr2 = str2.split(""); //状況に合わせて
        int flag = 0;
        sc.close();

        for(int i=0;i<astr.length;i++){
            if(astr[i].equals(astr2[i])){
                flag +=1;
            }
        }
        System.out.println(flag);
    }
}