import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S=sc.next();
        String T =sc.next();
        char[] S_ch=S.toCharArray();
        char[] T_ch=T.toCharArray();
        boolean ans=false;
        for(int i=0,j=0;i<S.length();i++){
            if(S_ch[i]==T_ch[j]||S_ch[i]=='?'){
                int tmp=i;
                for(;i<S.length()&&j<T.length();i++,j++){
                    if(S_ch[i]!=T_ch[j]){
                        if(S_ch[i]=='?'){
                            continue;
                        }
                        break;
                    }
                    }
                if(j==T.length()){
                    ans=true;
                    for(int k=0;k<j;k++){
                        S_ch[tmp+k]=T_ch[k];
                }
                    break;
                }else{
                    i=tmp;
                    j=0;
                }
            }
        }
        if(ans==true){
        for(int i=0;i<S.length();i++){
            if(S_ch[i]=='?'){
                System.out.print("a");
                continue;
            }
            System.out.print(S_ch[i]);
        }System.out.println("");
    }else{
            System.out.println("UNRESTORABLE");
        }
    }
}