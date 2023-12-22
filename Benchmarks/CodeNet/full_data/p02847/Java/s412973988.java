import java.util.Scanner;//文字列の読み込みにScanner使用
class Main
{
 public static void main(String[] args)
    {
    String str;
    Scanner scan = new Scanner(System.in);
    str = scan.nextLine();
        if(str.equals("SUN")) //格納された文字列の比較は 文字列.equals(文字オブジェクト)
        System.out.println("7");
    else if(str.equals("MON"))
        System.out.println("6");
    else if(str.equals("TUE"))
        System.out.println("5");
    else if(str.equals("WED"))
        System.out.println("4");
    else if(str.equals("THU"))
        System.out.println("3");
    else if(str.equals("FRI"))
        System.out.println("2");
    else if(str.equals("SAT"))
        System.out.println("1");
    }
}
