import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c= sc.nextInt();
//        int d= sc.nextInt();
//        int e= sc.nextInt();
       
        int ar[] = new int[5];
        boolean what = true;
        for(int i = 0 ; i<5 ; i++){
            ar[i] = sc.nextInt();
        }
         int k= sc.nextInt();
         for(int i = 0 ; i<ar.length-1 ; i++){
             for(int j = i; j<ar.length-1 ;j++){
                 
                 if(Math.abs((ar[i] - ar[j+1])) >k) {what = false;

                 break ;}
                
             }
              if(what == false) break;
         }
         
         if(what == false) System.out.println(":(");
         else System.out.println("Yay!");
    }
}
