import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int length=scan.nextInt();
        String str=scan.next();
        int count=0;
        int i;
        int max=0;
        for(i=0;i<length;i++){
            if(str.charAt(i)=='I'){
                count++;
            }
            else if(str.charAt(i)=='D'){
                count--;
            }
           if(max<count){
               max=count;
           }
        }
        System.out.println(max);
    }
}