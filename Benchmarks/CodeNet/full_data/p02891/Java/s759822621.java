import java.util.*;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        long k=sc.nextLong();
        int l=s.length();
        int x=0;
      	long o=0;
        char a=s.charAt(0);
      	char b;
        boolean p=false;
        if(l>1){
            b=s.charAt(1);
            for(int i=1;i<l;i++){
                b=s.charAt(i);
                if(a==b && !p){
                    p=true;
                    x++;
                }else{
                    p=false;
                }
                a=b;
            }
            o+=x*k;
            if(!p && b==s.charAt(0)){
                o+=k-1;
            }
        }else{
        	o=k/2;
        }
        System.out.println(o);
    }
}