class Main{
     public static void main(String[] a){
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int k = in.nextInt();
int x = in.nextInt();
int y = in.nextInt();
int ans = k*x+(n-k)*y;
System.out.println(ans);
     }
}