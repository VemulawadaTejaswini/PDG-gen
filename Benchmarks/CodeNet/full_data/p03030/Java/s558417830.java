import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[N];
        int[] a = new int[N];
        int[] num = new int[N];
        String[] s = new String[N];
        
        for(int i=0; i<N; i++){
            str[i] = sc.next();
            a[i] = sc.nextInt();
            if(i<9){
                num[i] = 1;
            }else if(i < 99){
                num[i] = 2;
            }else{
                num[i] = 3;
            }
            if(a[i]<91){
                s[i] = str[i]+(100-a[i])+(i+1)+num[i];
            }else{
                s[i] = str[i]+0+(100-a[i])+(i+1)+num[i];
            }
            //System.out.println(s[i]);
        }
        Arrays.sort(s);
        for(int i=0; i<N; i++){
            //System.out.println(s[i]);
            if(s[i].charAt(s[i].length()-1) == '1'){
                System.out.println(s[i].charAt(s[i].length()-2));
            }else if(s[i].charAt(s[i].length()-1) == '2'){
                System.out.print(s[i].charAt(s[i].length()-3));
                System.out.println(s[i].charAt(s[i].length()-2));
            }else{
                System.out.print(s[i].charAt(s[i].length()-4));
                System.out.print(s[i].charAt(s[i].length()-3));
                System.out.println(s[i].charAt(s[i].length()-2));
            }
            //System.out.println(s[i].charAt(s[i].length()-1));
        }
    }
}