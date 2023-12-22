import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String S;
        S = sc.next();
        char [] list = new char[S.length()];
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int a=0;a<S.length();a++){
            list[a] = S.charAt(a);
        }
        for(int a=0;a<S.length()-1;a++){
            if((list[a]=='1'&&list[a+1]=='0')||(list[a]=='0'&&list[a+1]=='1')){
                int num=S.length()-(a+1);
                if(num>a){
                    for(int b=a+1;b<S.length();b++){
                        if(list[a] =='1') list[a] ='0';
                        else list[a] ='1';
                    }
                    if(num!=1) list2.add(num);
                }
                else if(num<=a){
                    for(int b=0;b<=a;b++){
                        if(list[a] =='1') list[a] ='0';
                        else list[a] ='1';
                    }
                    if(num!=1)list2.add(num);
                }
            }
        }
        System.out.println(Collections.min(list2));
    }
}
