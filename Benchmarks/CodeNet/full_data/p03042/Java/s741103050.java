import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

     String s = sc.next();
     char[] c = new char[4];
     int[] a = new int[4];

     for (int i = 0;i<4 ;i++ ) {
       c[i] = s.charAt(i);
     }

     for (int i = 0;i<4 ;i++ ) {
       String sn = String.valueOf(c[i]);
       a[i] =  Integer.parseInt(sn);
     }

     if (a[0]*10+a[1]<=12&&a[0]*10+a[1]>0) {
       if (a[2]*10+a[3]<=12&&a[2]*10+a[3]>0) {
         System.out.println("AMBIGUOUS");
         System.exit(0);
       }
     }

     if (a[2]*10+a[3]<=12&&a[2]*10+a[3]>0) {
        System.out.println("YYMM");
     }else if(a[0]*10+a[1]<=12&&a[0]*10+a[1]>0){
       System.out.println("MMYY");
     }else{
       System.out.println("NA");
     }


      }
    }
