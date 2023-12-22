import java.util.Scanner;

class Bcontest122_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.toString();
        String ans = null;
        if("A" == str){
            ans = "T";
        }else if("T" == str){
            ans = "A";
        }else if("C" == str){
            ans = "G";
        }else if("G" == str){
            ans = "C";
        }

        System.out.println(ans);
    }
}