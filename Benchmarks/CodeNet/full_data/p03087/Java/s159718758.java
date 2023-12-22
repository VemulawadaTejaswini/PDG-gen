import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt(),Q = sc.nextInt(),cnt,a,b;
        String S = sc.next(),str;
        char s1,s2;
        int[] count =new int[Q];

        for(int i = 0;i < Q;i++){
            cnt = 0;
            a = sc.nextInt();
            b = sc.nextInt();
            str = S.substring(a-1,b);
            for(int j = 0;j < str.length()-1;j++){
                s1 = str.charAt(j);
                s2 = str.charAt(j+1);
                if(s1 == 'A' && s2 == 'C'){
                    cnt++;
                }
            }
            count[i] = cnt;
        }
        for(int i = 0;i < Q;i++){
            System.out.println(count[i]);
        }
    }
}