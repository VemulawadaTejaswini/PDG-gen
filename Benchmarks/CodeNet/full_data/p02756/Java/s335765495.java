import java.util.*;

class Main{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   StringBuilder s = new StringBuilder(sc.next());
   StringBuilder pres = new StringBuilder();
   StringBuilder afts = new StringBuilder();
   int flip = 0;
   int q = sc.nextInt();
   for(int i=0;i<q;i++){
     int op = sc.nextInt();
     if (op == 1){
       flip ^= 1;
     }else{
       int op2 = sc.nextInt();
       String st = sc.next();
       if (flip == 0){
         if (op2 == 1){
           pres.insert(0,st);
       }else{
           afts.append(st);
         }
       }
       else{
        if (op2 == 1){
           afts.insert(0,st);
       }else{
           pres.append(st);
         }
       } 
         
       }
       
     }
  if (flip == 1){
   StringBuilder stemp =  new StringBuilder(pres);
   pres = new StringBuilder(afts);
   afts = new StringBuilder(stemp);
  }
  //System.out.println(pres);
  //System.out.println(s);
  //System.out.println(afts);
  
  pres.append(s);  
  pres.append(afts);
  System.out.println(pres);
}
}