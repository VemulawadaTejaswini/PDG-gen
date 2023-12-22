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
            for(char c:s.toCharArray()){
                switch (c){
                    case 'N':a++;
                        break;
                    case 'S':a--;
                        break;
                    case 'E':b++;
                        break;
                    case 'W':b--;
                        break;
                }
            }
            System.out.println((a==0&&b==0)?"Yes":"No");
        }
    }
}