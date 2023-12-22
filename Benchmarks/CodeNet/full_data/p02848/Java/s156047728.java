import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        int a;//何文字後か
        String str;
        String str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String [] sa2 = str2.split("");
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        a = scan1.nextInt();
        str = scan2.nextLine();
        String [] sa = str.split("");//から文字で区切り配列に格納
        for(int i=0;i<str.length();i++){
            sa[i] = sa2[(i+a)%25]; //剰余で何文字ずれるか計算
            System.out.print(sa[i]);
        }
        System.out.println("");
    }
}