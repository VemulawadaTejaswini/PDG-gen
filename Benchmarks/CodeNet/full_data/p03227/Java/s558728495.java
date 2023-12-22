import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
if(line.length()==2)
        System.out.println(line);
else{
String s[]=line.split("",0);
System.out.println(s[2]+s[1]+s[0]);
}
    }
}