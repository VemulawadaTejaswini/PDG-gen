import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String S = scan.next();
        if(S.equals("zyxwvutsrqponmlkjihgfedcba")){
            System.out.println(-1);
            return;
        }
        boolean used[] = new boolean[26];
        char alpha[] = new char[26];
        alpha[0]='a';
        for(int i=0;i<25;++i)alpha[i+1]=(char)(alpha[i]+1);
        if(S.length()==26){
            for(int i=0;i<26;++i)if(S.charAt(i)!=alpha[i]){
                if(S.charAt(i)=='z')i--;
                System.out.println(S.substring(0,i) + alpha[i+1]);
                return;
            }
        }else{
            for(int i=0;i<S.length();++i)used[S.charAt(i)-'a']=true;
            for(int i=0;i<26;++i)if(!used[i]){
                S+=alpha[i];
                System.out.println(S);
                return;
            }
        }


    }
}