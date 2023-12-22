import java.util.Scanner;

/**
 * Created by wenzhong on 2016/8/21.
 */
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String s=in.next();
            int a=0;
            int b=0;
            int c1=0;
            int d=0;
            for(char c:s.toCharArray()){
                switch (c){
                    case 'N':a++;
                        break;
                    case 'S':b++;
                        break;
                    case 'E':c1++;
                        break;
                    case 'W':d++;
                        break;
                }
            }
            boolean flag=true;
            flag&=((a==0&&b==0)||(a!=0&&b!=0))&((c1==0&&d==0)||(c1!=0&&d!=0));
            System.out.println(flag?"Yes":"No");
        }
    }
}
