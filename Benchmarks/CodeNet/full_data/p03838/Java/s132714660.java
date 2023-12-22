import java.util.*;

 
class Main {
 
    private static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        String s = sc.next();
        String s2 = sc.next();
        //int x =Integer.parseInt(s);
        //int y =Integer.parseInt(s);
        long x =Long.parseLong(s);
        long y = Long.parseLong(s2);
        long push=0;
        if(x>0){
            if(x<y){
                push=y-x;
            }else{
                if(Math.abs(y)>x){
                    push=Math.abs(y)-x+1;
                }else{
                    push=x-Math.abs(y)+1;
                }
            }   
        }else{
            if(x<y){
                if(Math.abs(y)>x){
                    push=y-Math.abs(x)+1;
                }else{
                    push=Math.abs(x)-y+1;
                }
            }else{
                push=x-y+2;
            }

        }
        System.out.println(push);
        //String s = String.valueOf(i);
        //int i = Integer.parseInt(s);
        //System.out.println((s + s).contains(s2) ? "Yes" : "No");

    }
}