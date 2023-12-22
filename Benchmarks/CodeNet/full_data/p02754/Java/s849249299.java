import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int n=kbd.nextInt();
   int a=kbd.nextInt();
   int b=kbd.nextInt();

   int[] retu = new int[100000000];

   if(a==0){
     System.out.println(a);
   }else if(b==0){
     System.out.println(n);
   }else{
   int k=0;
   while(k<n+a+b){
   for(int i=k+0;i<k+a;i++){
     retu[i]=1;
   }
   for(int i=k+a;i<k+a+b;i++){
     retu[i]=2;
   }
   k=k+a+b;
 }
}

  int kazu=0;
  for(int i=0;i<n;i++){
    if(retu[i]==1){
      kazu=kazu+1;
    }
  }

  System.out.println(kazu);
}
}