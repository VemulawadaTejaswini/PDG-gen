import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        String str=sc.next();
        int tmpl;
        int tmpr;
        for(int i=0;i<q;i++){
            tmpl=sc.nextInt();
            tmpr=sc.nextInt();
            System.out.println((tmpr-tmpl+1-str.substring(tmpl-1,tmpr).replaceAll("AC","").length())/2);
        }
        
    }
}