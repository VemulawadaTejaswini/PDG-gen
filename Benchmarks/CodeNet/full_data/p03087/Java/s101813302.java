import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt(),Q = sc.nextInt(),cnt,a,b,n=0;
        String S = sc.next();
        char s1,s2;
        int[] count =new int[Q];

        for(int i = 0;i < Q;i++){
            cnt = 0;
            a = sc.nextInt();
            b = sc.nextInt();
            char[] str = S.substring(a-1,b).toCharArray();
            for(int j = 0;j < str.length-1;j++){
                if(str[j] == 'A'&& str[j+1] == 'C')
                    cnt++;
            }
            count[i] = cnt;
        }
        for(int i = 0;i < Q;i++){
            System.out.println(count[i]);
        }
    }
}