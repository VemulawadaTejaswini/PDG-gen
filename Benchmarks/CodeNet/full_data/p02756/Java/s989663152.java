
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        int q=scanner.nextInt();
        StringBuilder stringBuilder=new StringBuilder(str);
        int c=0;
        for(int j=0;j<q;j++){
            int t=scanner.nextInt();
            if(t==1){
//                stringBuilder=stringBuilder.reverse();
                c++;
            }
            else{
                int f=scanner.nextInt();
                if(f==1){
                    if(c%2!=0){
                        stringBuilder=stringBuilder.reverse();
                        c=0;
                    }
                    char ss=scanner.next().charAt(0);
                    String strr=ss+String.valueOf(stringBuilder);
                    stringBuilder=new StringBuilder(strr);
                }
                else{
                    if(c%2!=0){
                        stringBuilder=stringBuilder.reverse();
                        c=0;
                    }
                    char ss=scanner.next().charAt(0);
                    stringBuilder.append(ss);
                }
            }
        }
        if(c%2!=0){
            stringBuilder=stringBuilder.reverse();
            c=0;
        }
        System.out.println(stringBuilder.toString());
    }
}
