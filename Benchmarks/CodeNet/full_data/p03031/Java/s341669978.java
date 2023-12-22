import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int[] s = new int[m];
    int[] p = new int[m];
    int k;
    int i,j,l;
    int sum = 0;
    for(i=0;i<m;i++){
      k = Integer.parseInt(sc.next());
      for(j=0;j<k;j++){
        s[i]+=1<<(Integer.parseInt(sc.next())-1);
      }
    }
    for(i=0;i<m;i++){
      p[i] = Integer.parseInt(sc.next());
    }
    int count = 0;
    int tmp;
    
    for(i=0;i<(1<<n);i++){
      for(j=0;j<m;j++){
        tmp = i&s[j];
        count = 0;
        for(l=0;l<n;l++){
          if((tmp&1)==1)count++;
          tmp>>=1;
        }
        if((count%2)!=p[j])break;
      }
      if(j==m)sum++;
    }
    System.out.print(sum);
    System.out.flush();
  }
}