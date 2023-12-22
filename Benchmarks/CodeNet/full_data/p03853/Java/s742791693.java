import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(),w = sc.nextInt();
        String[] s = new String[h];
        for(int i = 0;i<h;i++){
            s[i] = sc.next();
        }
        sc.close();
        for(int i =0;i<2*h;i++){
            System.out.println(s[i/2]);
        }
    }
}