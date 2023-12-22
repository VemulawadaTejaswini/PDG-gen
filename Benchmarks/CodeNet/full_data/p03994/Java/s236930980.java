import java.util.Scanner;

/**
 * Created by yangyuyin on 16/10/8.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        char[] letters=s.toCharArray();
        int t;
        for(int i=0;i<letters.length-1;i++){
            t=26-(letters[i]-'a');
            if(k>=t){
                k-=t;
                letters[i]='a';
            }
        }
        int end=letters.length-1;
        k=k%26;
        letters[end]=(char) ('a'+(letters[end]-'a'+k)%26);
        System.out.println(new String(letters));
    }
}