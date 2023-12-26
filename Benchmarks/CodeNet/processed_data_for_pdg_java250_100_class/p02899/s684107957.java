public class Main {
    public static void main(String args[] ) {
        Scanner s = new Scanner(System.in);
       int n=s.nextInt();
int a[]=new int[n];
List<Integer>l=new ArrayList<Integer>();
for(int i=0;i<n;i++){
int t=s.nextInt();
 a[t-1]=i+1;
}
for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");
    }
}
