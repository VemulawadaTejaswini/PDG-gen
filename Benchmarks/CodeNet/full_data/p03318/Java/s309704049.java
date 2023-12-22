import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        String s[]={"1","2","3","4","5","6","7","8","9"};
        String l="";
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int k=Integer.parseInt(line);
        int a=10;
        for(int i=0;i<k;i++){
            if(i==27||i==18||i==9){
                l+="9";
            }
            if(i<36){
                System.out.println(s[i%9]+l);
            }
            else {
                System.out.println(a+l);
                a++;
            }
            
        }
    }
}