class Main{
  public static void main(String[] args){
    Scanar sc=new Scanaer(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    
    if((a*b)%2==0){
      System.out.println("Even");
    }else{
      System.out.println("Odd");
    }
  }
}