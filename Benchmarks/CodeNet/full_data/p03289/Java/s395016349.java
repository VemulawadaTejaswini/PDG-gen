import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        String ans;
        if(s.charAt(0)=='A'){
            int count=0;
            for(int i=2;i<n-1;i++){
                if(s.charAt(i)=='C'){
                    count++;
                }
            }
            if(count==1){
                boolean b=true;
                for(int i=0;i<n;i++){
                    if(s.charAt(i)!='A' && s.charAt(i)!='C'){
                        int ascii=s.charAt(i);
                        if(ascii<97 || ascii>122){
                            b=false;
                            break;
                        }
                    }
                }
                if(!b){
                    ans="WA";
                }
                else{
                    ans="AC";
                }
            }
            else{
                ans="WA";
            }      
        }
        else{
            ans="WA";
        }
        System.out.println(ans);
    }
}