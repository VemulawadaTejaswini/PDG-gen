import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n];
    for(int i=0;i<n;i++) a[i] = sc.nextInt();
    for(int i=0;i<n;i++) b[i] = sc.nextInt();
    int count = 0;
    while(true){
      int kkk = it(a,b);
      if(kkk==-1){
        count=-1;break;
      }else if(kkk==1){
        break;
      }
      int max = b[0],num=0;
      for(int i=1;i<n;i++){
        if(max<b[i]){
          max = b[i];
          num = i;
        }
      }
      if(num==0){
        b[0] -= b[n-1]+b[1];
      }else if(num==n-1){
        b[n-1] -= b[n-2]+b[0];
      }else{
        b[num] -= b[num-1]+b[num+1];
      }
      count++;
    }
    System.out.println(count);
  }

  public static int it(int[]a,int[]b){
    int n = a.length;
    for(int i=0;i<n;i++){
      if(a[i]>b[i]){
        return -1;
      }else if(a[i]!=b[i]){
        return 0;
      }
    }
    return 1;
  }
}

