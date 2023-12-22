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
       if(x>=w/2) {
    	   max=(w-x)*h;
       }else {
    	   max=x*h;
       }
       if(y>=h/2) {
    	   if(max<=(h-y)*w)
    	   max=(h-y)*w;
       }else {
    	   if(max<=y*w)
    	   max=y*w;
       }
       if(w/2==x && h/2==y) {
    	   isMultiple=1;
       }
       System.out.println(max+" "+isMultiple);
    }
}
