import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) throws MyException {
        
     // S,Tを入力
     Scanner scan = new Scanner(System.in);
     String S = scan.next();
     String T = scan.next();

     // S,Tは1文字以上10文字以下
     if(S.length()<1 || S.length()>10) throw new MyException("");
     if(T.length()<1 || T.length()>10) throw new MyException("");
     // S,Tは英字小文字からなる文字列
     if (!Pattern.matches("^[a-z]+$", S)) throw new MyException("");
     if (!Pattern.matches("^[a-z]+$", T)) throw new MyException("");

     // S≠T
     if(S.equals(T)) throw new MyException("");
          
     // A,Bを入力して下さい
    String As = scan.next();
    String Bs = scan.next();

     // A,Bは整数
     if(!Pattern.compile("^-?[0-9]+$").matcher(As).find()) throw new MyException("");
     if(!Pattern.compile("^-?[0-9]+$").matcher(Bs).find()) throw new MyException("");

    // A,Bを数値に変換
	int A = Integer.parseInt(As);
	int B = Integer.parseInt(Bs);

     // 1≦A, B≦10
     if(A<1 || A>10) throw new MyException("");
     if(B<1 || B>10) throw new MyException("");

     // Uを入力
     String U = scan.next ();
     // SまたはTと一致しなかったらエラー
     if(!U.equals(S) && !U.equals(T)) throw new MyException("");

     if(U.equals(S)) System.out.println((A-1) +" "+ B);
     if(U.equals(T)) System.out.println(A +" "+ (B-1));
          
     scan.close();
    }
}

class MyException extends Exception{
  public MyException(String msg){
    super(msg);
  }
}