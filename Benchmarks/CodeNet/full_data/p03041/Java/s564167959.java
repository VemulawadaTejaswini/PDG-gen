import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();
        String S = sc.next();
        char[] str = new char[N];
        char s = S.charAt(k-1);

        for(int i = 0;i < N;i++){
            str[i] = S.charAt(i);
            if((s == 'A' && str[i] == 'A')){
                str[i] = 'a';
            }else if(s == 'B' && str[i] == 'B'){
                str[i] = 'b';
            }else if(s == 'C' && str[i] == 'C'){
                str[i]  = 'c';
            }
        }

        for(int i = 0;i < N;i++){
            System.out.print(str[i]);
        }

        

    }
}