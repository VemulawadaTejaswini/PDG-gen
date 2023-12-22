import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int xGroup;
        if(x==1 || x==3 || x==5 || x==7 || x==8 || x==10 || x==12){
            xGroup = 1;
        }else if(x ==4 || x==6 || x==9 || x==11){
            xGroup = 2;
        }else{
            xGroup = 3;
        }
        int yGroup;
        if(y==1 || y==3 || y==5 || y==7 || y==8 || y==10 || y==12){
            yGroup = 1;
        }else if(y ==4 || y==6 || y==9 || y==11){
            yGroup = 2;
        }else{
            yGroup = 3;
        }
        if(xGroup == yGroup){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }       
}