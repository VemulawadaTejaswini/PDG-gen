import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int kai=0;
        int Bs=0;
        int len=s.length();
        for(int i=0; i<len; i++){
            if(s.charAt(i)=='B'){Bs++;kai+=(len-i)-Bs;}
        }
        System.out.println(kai);
    }
}
