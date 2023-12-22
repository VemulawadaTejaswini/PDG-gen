import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int year=scn.nextInt();
        int flag=0;
        switch(year){
            case 3:
            case 5:
            case 7:
            flag++;
        }
        if(flag==1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}