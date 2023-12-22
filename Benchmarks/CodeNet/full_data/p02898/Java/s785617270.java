import java.util.Scanner;
class Roller{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many of you : ");
        int N=sc.nextInt();
        int m=0; //numbers of people allowed to ride
        //tall requirement
        System.out.println("To ride the most popular roller coaster,you must be at least (centimeters) : ");
        int K=sc.nextInt();
        for(int i=1;i<=N;i++){
            System.out.println("The "+i+" friend's height : ");
            int h=sc.nextInt();
            if(h>=K){
              m++;
            }
        }
        System.out.println(m);
}
}

