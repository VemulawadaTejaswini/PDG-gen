public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int q=sc.nextInt();
    int count1[]=new int[n+1];
    int count2[]=new int[n+1];
    int a[]=new int[n+1];
    for (int i=1;i<=q;i++) {
      int m=sc.nextInt();
      count1[m]++;
    }
    for (int i=1;i<=n;i++) {
      count2[i]=q-count1[i];
    }
    for (int i=1;i<=n;i++) {
      a[i]=k-count2[i];
      if (a[i]>0) {
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}
