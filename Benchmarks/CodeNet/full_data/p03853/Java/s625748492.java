import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        String pic[]=new String[h];
        for(int i=0;i<h;i++){
            pic[i]=sc.next();
        }
        for(int i=0;i<h;i++){
            for(int k=0;k<2;k++){
                System.out.println(pic[i]);
            }
        }
    }
}