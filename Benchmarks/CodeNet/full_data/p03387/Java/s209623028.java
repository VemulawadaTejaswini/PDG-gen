import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

       Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[]s=line.split("",0);
        int n=1;
        for(int i=0;i<s.length-1;i++){
            if(s[i].equals(s[i+1])){
                n++;
            }
            else{
               System.out.print(s[i]+n); 
               n=1;
            }
            
        }
        System.out.println(s[s.length-1]+n);
    }
}