import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new arr[n];
    arr[0]=2;
      arr[1]=3;
        arr[2]=5;
          arr[3]=7;
            arr[4]=11;
for(int i=5;i<n;i++){
outer:for(int num=arr[i-1]+2;num<55555;num++){
//  boolean prime=true;
  for(int root=2;root<(int)Math.pow(num,0.5);root++){
    if(num%root==0){
      //prime=false;
      continue outer;
    }
  }
  for(int A=0;A<n;A++){
    for(int B=A+1;B<n;B++){
      for(int C=B+1;C<n;C++){
        for(int D=C+1;D<n;D++){
          for(int E=D+1;E<n;E++){
            for(int root=2;root<(int)Math.pow(arr[A]+arr[B]+arr[C]+arr[D]+arr[E],0.5);root++){
              if(arr[A]+arr[B]+arr[C]+arr[D]+arr[E]%root!=0){
                //prime=false;
                continue outer;
              }
            }
          }
        }
      }
    }
  }
  arr[i]=num;
  break;
}
}
  for(int i=0;i<n;i++){
    System.out.print(arr[i]);
    if(i!=n-1)
    System.out.print(" ");
  }

  }
}
