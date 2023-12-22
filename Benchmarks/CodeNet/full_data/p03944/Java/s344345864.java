import java.util.*;
 class ck {

 public static void main(String[] args) {
   Scanner no=new Scanner(System.in);
   int n=no.nextInt();
   int u=n;
   int m=no.nextInt();
   int minx=0;
   int maxx=n;
   int miny=0;
   int maxy=m;
   int v=m;
   int t=no.nextInt();
   for(int i=0;i<t;i++){
     int a=no.nextInt();
     int b=no.nextInt();
     int y=no.nextInt();
    /* 5 4 2
     2 1 1
     3 3 4*/
     if(y==1){
       if(a>minx){
         minx=a;
       }
       //u=a;
     }
     else if(y==2){
      if(maxx>a){
        maxx=a;
      }
      // a=a-n;
     }
     else if(y==3){
      if(b>miny){
        miny=b;
      }
       //v=b;
     }
     else{
      if(maxy>b){
        maxy=b;
      }
      // v=b-m;
     }
   }
   if(minx>=maxx||miny>=maxy){
     System.out.println("0");
   }
   else System.out.println((maxx-minx)*(maxy-miny));
 }

}
 