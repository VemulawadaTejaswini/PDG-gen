public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int N =sc.nextInt();
      int M =sc.nextInt();
      int item[] = new int[N];
      double sum =0;
      int count =0;
      for(int i=0; i<N; i++){
        	item [i] = sc.nextInt();
             sum += item[i];
      }
      double min = sum/(4*M);    
      for(int i=0; i<N; i++){
        if(item[i]>=min){
          count++;
        }
      }
      if(count>=M){
          System.out.println("Yes");
      }
      else{
          System.out.println("No");   
      }     
    }
}
