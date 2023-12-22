import java.util.*;

/**
 *
 * @author Dheeresh
 */
public class Main {
    int a,b,c,d,e,f,g,i,j,k;
    Scanner scanner;
    String[] strs,strs2;
    String str,str2,str3;
    
    public static void main(String args[]){
        new Main();
    }
    
    public Main(){
        scanner=new Scanner(System.in);
        strs=scanner.nextLine().split(" ");
        c=Integer.parseInt(strs[0]);
        a=Integer.parseInt(strs[1]);
        b=pi(strs[2]);
        e=a+(c-1)*b;
        d=b+(c-1)*a;
        /*p(d+" "+e);
        if(d<e){
            p(d-c*a+c*b-e-2);
        }else{
            p(b-a+1);
        }*/
        if(a>b||(a!=b&&c==1)){
            p("0");
        }else if(c==1||a==b){
            p("1");
        }else if(c==2){
            p("1");
        }else{
            p(e-d+1);
        }
    }
    
    int pi(String str){
        return Integer.parseInt(str);
    }
    
    void p(String s){
        System.out.println(s);
    }
    
    void p(long l){
        System.out.println(l);
    }
    
    void p(double d){
        System.out.println(d);
    }
    
    void p(int i){
        System.out.println(i);
    }
    
    void p(Object o){
        System.out.println(o);
    }
    
    void p(){
        System.out.println();
    }
    
    void pp(String s){
        System.out.print(s);
    }
}
