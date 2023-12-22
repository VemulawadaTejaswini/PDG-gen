import jav.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int n= sc.nextInt();
    int a[]= new int[n];
    double sum=0;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      sum+=1/a[i];
    }
    System.out.println(1/sum);
  }
}
    