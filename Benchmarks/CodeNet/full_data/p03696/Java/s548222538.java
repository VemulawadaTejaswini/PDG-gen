import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
            String S = sc.next();

            StringBuilder copy = new StringBuilder(S);

            int flag=0;

            while(flag==0){
                flag=1;
                for(int i=0; i+1<copy.length(); i++){
                if(copy.charAt(i)=='('&&copy.charAt(i+1)==')'){
                    copy.delete(i,i+2);
                    flag=0;
                    break;
                }
            }
        }

        int res=0;
        int res1 = 0;

        for(int i=0; i<copy.length(); i++){
            if(copy.charAt(i)=='(') res1++;
            if(copy.charAt(i)==')') res++;
        }

        for(int i=0; i<res; i++) System.out.print('(');
        System.out.print(S);
        for(int i=0; i<res1; i++) System.out.print(')');

        }
    }
    