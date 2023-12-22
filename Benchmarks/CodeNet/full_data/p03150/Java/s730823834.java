import java.util.*;
public class Main{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = "keyence";
        String ans="NO";
        int l=0;
        int cou=0;
        int p=0;
        boolean flg=false;
        for (int i=0;i<a.length();i++) {
            char c = a.charAt(i);
            char d = b.charAt(l);
            if(c==d){
                flg=true;
                l++;
                if(l==b.length()){
                    ans="YES";
                    break;
                }
            }else{
                if(flg){
                    cou++;
                    flg=false;
                }
                if (cou==2) {
                    cou=0;
                    i=p;
                    l=0;
                    flg=false;
                    p++;
                    if(p==a.length()){break;}
                    continue;
                }
            }
        }
        System.out.println(ans);
	}
}