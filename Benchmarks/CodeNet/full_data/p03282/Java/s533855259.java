import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    static StringBuffer sb = new StringBuffer();
    public static void main(String args[]){
        String S=sc.next();
        int i=0;
        char l='1';
        while(l=='1'){
            l=S.charAt(i);
            i++;
        }
        System.out.println(l);
    }
}
