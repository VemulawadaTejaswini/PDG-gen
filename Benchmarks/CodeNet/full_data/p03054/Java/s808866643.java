import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int sr = sc.nextInt();
        int st = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        int tmpst=st;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='L'){
                tmpst--;
            }
            if(tmpst==0){
                System.out.println("NO");
                return;
            }
            if(t.charAt(i)=='R'){
                if(tmpst!=w)tmpst++;
            }
        }
        tmpst=st;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='R'){
                tmpst++;
            }
            if(tmpst==w+1){
                System.out.println("NO");
                return;
            }
            if(t.charAt(i)=='L'){
                if(tmpst!=1)tmpst--;
            }
        }
        int tmpsr=sr;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='U'){
                tmpsr--;
            }
            if(tmpsr==0){
                System.out.println("NO");
                return;
            }
            if(t.charAt(i)=='D'){
                if(tmpsr!=h)tmpsr++;
            }
        }
        tmpsr=sr;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='D'){
                tmpsr++;
            }
            if(tmpsr==h+1){
                System.out.println("NO");
                return;
            }
            if(t.charAt(i)=='U'){
                if(tmpsr!=1)tmpsr--;
            }
        }
        System.out.println("YES");
    }

}
