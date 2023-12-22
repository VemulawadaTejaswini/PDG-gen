import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        boolean b=false;
        int x=s.nextInt();
        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
                if(i*j==x)
                {b=true;}
            }
        }
        if(b==true){System.out.println("Yes");}
        if(b==false){System.out.println("No");}
        }
        
    }