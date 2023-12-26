public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int N =sc.nextInt();
      int M =sc.nextInt();
      List<Integer>item = new ArrayList<>();
      double sum =0;
      int count =0;
      for(int i=0; i<N; i++){
        	 item.add(sc.nextInt());
             sum += item.get(i);
      }
      double min = sum/(4*M);    
      for(int i=0; i<N; i++){
        if(item.get(i)>=min){
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
