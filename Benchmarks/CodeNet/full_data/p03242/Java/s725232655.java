import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        for(int i = 0;i < n.length();i++){
            char s = n.charAt(i);

            if(s == '1'){
                s = '9';
                System.out.print(s);
            }else{
                s = '1';
                System.out.print(s);
            }
        }
    }
}