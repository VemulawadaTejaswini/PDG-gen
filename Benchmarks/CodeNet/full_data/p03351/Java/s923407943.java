import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();
        String answer = "No";
        if(Math.abs(a-c)<=d){
            answer = "Yes";
        }else if(Math.abs(a-b)<=d&&Math.abs(b-c)<=d){
            answer = "Yes";
        }
        System.out.println(answer);
    }
}
