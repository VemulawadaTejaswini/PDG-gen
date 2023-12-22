import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        for(i=1;i<=100;i++){
            if((a*i)%b==c){
                break;
            }
        }
        if(sum%b==c){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}


