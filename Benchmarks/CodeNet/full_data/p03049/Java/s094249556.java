import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;
        int ab=0;
        String tmp;
        int ba=0;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            tmp=sc.next();
            if(tmp.charAt(0)=='B'&&tmp.charAt(tmp.length()-1)=='A'){
                ba++;
            }else if(tmp.charAt(0)=='B'){
                b++;
            }else if(tmp.charAt(tmp.length()-1)=='A'){
                a++;
            }
            ab+=(tmp.length()-tmp.replaceAll("AB","").length())/2;
        }
        if(ba==0){
            System.out.println(Math.min(a,b)+ab);
        }else{
            if(a!=b){
                System.out.println(ba+Math.min(a,b)+ab);
            }else{
                System.out.println(a+ba-1+ab);
            }
        }
        
    }
}
