import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int score=0;
        if(x==1&&y==1){
            score+=400000;
        }
        if(x==1||y==1){
            score+=300000;
        }
        if(x==2||y==2){
            score+=200000;
        }
        if(x==3||y==3){
            score+=100000;
        }
        System.out.println(score);
    }
}