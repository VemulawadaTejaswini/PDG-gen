import java.util.Scanner;
 
class Main{
  Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int[] ar = new int[N];
  boolean F = false;
  for(int i = 0;i<N;i++){
    ar(i) = sc.nextInt();
    if(ar(i)%2 == 1){
      F = true;
    }
  }
  
  if(F == true){
    System.out.println(0);
  }else{
    for(int i=0;i<N;i++){
      int times = 0;
      while(a(i)/2==0){
        a(i) /= 2;
        times++;
      }
      System.out.println(times);
    }
  }
}  