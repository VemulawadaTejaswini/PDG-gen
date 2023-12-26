class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt(); 
    int B = sc.nextInt(); 
    int C = sc.nextInt(); 
    int D = sc.nextInt(); 
    int count = 0;
    do{
      if (count % 2 == 0){
      	C = C - B;
      }
      else{
        A = A - D;
      }
      count++ ;
    }while(A*C > 0);
    if (A <= 0)
      System.out.println("No");
    else{
     if (C <= 0) 
      System.out.println("Yes");
     else
       System.out.println("ERROR");
    }
  }
}
