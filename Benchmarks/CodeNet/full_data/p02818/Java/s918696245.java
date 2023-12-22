import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
long A = sc.nextLong();
long B = sc.nextLong();
long K = sc.nextLong();
for (int i=0;i<K;i++){
  if(A==0){
    if(B==0){
    }else{
      B=B-1;
    }
  }else{
    A=A-1;
  }
  System.out.println(A);
  System.out.println(B);
}
System.out.println(A+" "+B);
  }
}