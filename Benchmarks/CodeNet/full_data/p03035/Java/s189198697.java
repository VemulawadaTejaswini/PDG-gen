import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int year = scn.nextInt();
        int cost = scn.nextInt();
        if(6<=year&&year<=12){
            System.out.println(cost/2);
        }else if(year<6){
            System.out.println(0);
        }else{
            System.out.println(cost);
        }
    }
}