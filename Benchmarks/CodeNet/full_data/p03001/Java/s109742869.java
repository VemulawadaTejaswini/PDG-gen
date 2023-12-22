import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w=sc.nextInt();
        int h=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        double max=0;
        int isMultiple=0;
       boolean  isMultipleFlag = false;
       if(w/2==x) {
    	   max=x*h/2;
    	   isMultipleFlag=true;
       }
       if(h/2==y) {
    	   max=y*w/2;
    	   if(isMultipleFlag) {
    		   isMultiple=1;
    	   }
       }
       System.out.println(max+" "+isMultiple);
    }
}
