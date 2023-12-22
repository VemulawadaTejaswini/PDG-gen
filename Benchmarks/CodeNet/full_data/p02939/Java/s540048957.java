import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] ss=s.toCharArray();
        int len=s.length();
        if(len==1)
            System.out.println(1);
        else if(len==2){
            System.out.println(ss[0]==ss[1]?1:2);
        }
        else {
            int re=1;
            char[] last=new char[2];
            last[0]=ss[0];
            last[1]='#';
            for(int i=1;i<len;){
                if(ss[i]!=last[0]||last[1]!='#'){
                   re++;
                   last[0]=ss[i];
                   last[1]='#';
                    i++;
                }else{
                    if(i+1<len){
                        re++;
                        last[0]=ss[i];
                        last[1]=ss[i+1];
                        i+=2;
                    }
                }

            }
            System.out.println(re);
        }

    }
}
