import java.util.*;

class Main{
public static void main(String[] args) {
  Scanner reader=new Scanner(System.in);
  int n=reader.nextInt();
  int m=reader.nextInt();
  Integer a[]=new Integer[n];
  int sum=0;

  for(int i=0;i<n;i++)
  {
    a[i]=(Integer)reader.nextInt();
    sum+=a[i];

  }
  Arrays.sort(a,Collections.reverseOrder());

  for(int i=0;i<m;i++)
  {
    if(a[i]<sum*1/4/m){
    System.out.println("No");
    return;
  }

  }
  System.out.println("Yes");

  }
}