import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try{
            String S = scan.next();
            String T = scan.next();

            int[] s = new int[26];
            int[] t = new int[26];

            for(int i = 0; i < S.length(); i++){
                s[S.charAt(i)-97]++;
                t[T.charAt(i)-97]++;
            }

            for(int i = 0; i < 26; i++){
                if(s[i] == t[i]){
                    //何もしない
                }else{
                    int index = getDiff(s[i]-t[i], i, s, t);
                    if(index == -1){
                        System.out.println("No");
                        System.exit(1);
                    }else{
                        t[index] += t[i];
                        t[i] = 0;
                    }
                }
            }
            System.out.println("Yes");



        }finally{
            scan.close();
        }
    }

    static int getDiff(int diff, int index, int[] s, int[] t){
        int diffIndex = -1;
        for(int i = index; i < 26; i++){
            if(t[i]-s[i] == diff){
                diffIndex = i;
                break;
            }
        }
        return diffIndex;
    }
}
