import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String a = scn.next();
        String b = scn.next();
        String answer = "No";
        int num=Integer.parseInt(a+b);
        for(int i=1;i*i<=num;i++){
            if(num==i*i){
                answer = "Yes";
                break;
            }
        }
        System.out.println(answer);
    }
}
