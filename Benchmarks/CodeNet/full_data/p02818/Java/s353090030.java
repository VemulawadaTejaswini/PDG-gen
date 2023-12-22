public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A,B,K;
    A=sc.nextInt();
    B=sc.nextInt();
    K=sc.nextInt();
    for(int i=0;i<K;i++){
      if(A>0){
        A--;
      }else{
        B--;
      }
    }
    System.out.println(A+" "+B);
    
    sc.close();
  }
}