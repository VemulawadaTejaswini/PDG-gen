import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


//入力変数
String[] S=new String[9];
String A=sc.next();
String B=sc.next();
String C=sc.next();


//入力値変換


//出力変数
String ans=A.substring(0,1)+B.substring(1,2)+C.substring(2,3);

//計算


//出力
System.out.println(ans);

}}