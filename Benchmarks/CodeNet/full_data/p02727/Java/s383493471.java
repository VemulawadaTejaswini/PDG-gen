import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int x=kbd.nextInt();
   int y=kbd.nextInt();
   int a=kbd.nextInt();
   int b=kbd.nextInt();
   int c=kbd.nextInt();
   int[] r = new int[b];
   for(int i=0;i<a;i++){
     r[i]=kbd.nextInt();
   int[] gg = new int[a];
 }
    for(int i=0;i<b;i++){
     g[i]=kbd.nextInt();
   int[] mm = new int[c];
 }
    for(int i=0;i<c;i++){
     mm[i]=kbd.nextInt();
   }

  int temp;
  for(int i=0;i<a-1;i++){
    for(int j=0;j<a-i-1;j++){
      if(r[j]<r[j+1]){
        temp=r[j];
        r[j]=r[j+1];
        r[j+1]=temp;
      }
    }
  }//小さい方が良い数値
  for(int i=0;i<b-1;i++){
    for(int j=0;j<b-i-1;j++){
      if(gg[j]<gg[j+1]){
        temp=gg[j];
        gg[j]=gg[j+1];
        gg[j+1]=temp;
      }
    }
  }
  for(int i=0;i<c-1;i++){
    for(int j=0;j<c-i-1;j++){
      if(mm[j]<mm[j+1]){
        temp=mm[j];
        mm[j]=mm[j+1];
        mm[j+1]=temp;
      }
    }
  }

  int CA=0;//Aのカウント
  int CB=0;
  for(int i=0;i<x;i++){
  if(mm[0]<r[i]){
    CA=CA+1;
  }
}
  for(int i=0;i<y;i++){
  if(mm[0]<gg[i]){
    CB=CB+1;
  }
}
  int p=CA;
  int q=CB;
  int n=0;
  while(CA<x+1||CB<y+1){
  for(int i=p;i<x;i++){
  if(r[i-1]<gg[q-1]){
    r[i-1]=mm[n];
    CA=CA+1;
    n=n+1;
  }
}

  for(int i=q;i<y;i++){
  if(r[n-1]<g[i-1]){
  gg[i-1]=mm[i-1+n];
  CB=CB+1;
  n=n+1;
}
}
}
  while(CA<x+1&&n<=c){
    for(int i=n;n<c;n++){
    r[i-1]=mm[n];
    CA=CA+1;
    n=n+1;
  }
}
while(CB<y+1&&n<=c){
  for(int i=n;n<c;n++){
    gg[i-1]=mm[n];
    CB=CB+1;
    n=n+1;
  }
}
int u=0;
int v=0;
for(int i=0;i<x;i++){
  u=u+r[i];
}
for(int i=0;i<y;i++){
  v=v+gg[i];
}
System.out.println(u+v);
}
}
