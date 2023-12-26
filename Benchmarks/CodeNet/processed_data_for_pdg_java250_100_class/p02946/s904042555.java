public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int K = sc.nextInt(); 
int X = sc.nextInt(); 
int f = X-K+1; 
int l = X+K-1; 
int p = 0; 
for(int i=f; i<=l; i++){
  p = i;
  System.out.printf(p+" ");
}
}
}
