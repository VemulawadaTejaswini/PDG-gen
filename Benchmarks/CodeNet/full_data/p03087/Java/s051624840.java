import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        int[] count =new int[Q];
        int a = 0;
        int b = 0;

        for(int i = 0;i < Q;i++){
            a = sc.nextInt();
            b = sc.nextInt();
            count[i] = judge(S.substring(a-1,b));
            System.out.println(count[i]);
        }
    }

    public static int judge(String str){
        char s1,s2;
        int count = 0;
        for(int i = 0;i < str.length()-1;i++){
            s1 = str.charAt(i);
            s2 = str.charAt(i+1);
            if(s1 == 'A' && s2 == 'C'){
                count++;
            }
        }
        return count;
    }
}