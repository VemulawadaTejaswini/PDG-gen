import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextline();

        char[] c = s.toCharArray();

        if(c.length/2*2 != c.length){
            System.out.println("No");
        }else{
            int check=0;
            for(int i = 0; i<c.length/2;i++){
                if(c[2*i] != "h" || c[2*i+1] != "i"){
                    check++;
                }
                if(check!=0){
                    System.out.println("No");
                }else{
                    System.out.println("Yes");
                }
            }
        }

    }
}