import java.util.Scanner;

class Main{
public static void main(String[] args){
int n;
  int[] v1,v2;
  {
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    v1=new int[n];
    v2=new int[n];
    for(int i=0;i<n;i++){
    v1[s.nextInt()]++;
    v2[s.nextInt()]++;
    }
  }
  int max1,max2;
  if((max1=max(v1))==(max2=max(v2))){
  if(v1[max1]<v2[max2]){
  v1[max1]=0;
    max1=max(v1);
  }else{
  v2[max2]=0;
    max2=max(v2);
  }
  }
  System.out.println(n-v1[max1]-v2[max2]);
}
  static int max(int[] v){
  int ans=0;
    for(int i=1;i<v.length;i++){
    if(v[i]>v[ans]){
    ans=i;
    }
    }
    return ans;
  }
}