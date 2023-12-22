package javalectures;
import java.util.Random;
import java.util.Scanner;
public class alCoder1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int n=s.length();
    Long k = sc.nextLong();
    String T="";
    for(int i=0;i<k;i++){
    T=s+T;
    }
    Random r = new Random();
    char c;
    char[] ch=T.toCharArray();
    int count=0;
    for(int i=0;i<T.length();i++){
        if(i!=T.length()-1){
        if(ch[i]==ch[i+1]){
            c=(char) (r.nextInt(26) + 'a');
            if(c!=ch[i+1]){
            ch[i+1]=c;
            count++;
            }
            else
            {
                c=(char) (r.nextInt(26) + 'a');
                ch[i+1]=c;
                count++;
            }
        }
    }
    }   
    String Final="";
    for(int i=0;i<T.length();i++){
        Final=Final+ch[i];
    }
    System.out.println(count);
    }
}