public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      String item[] = new String[N];
      int count =1;
      for(int i =0; i<N; i++){
      	item[i] = sc.next();
      }
      Arrays.sort(item);
      for(int i =0; i<N-1; i++){
        if(!item[i].equals(item[i+1])){
          count++;
        }
      }
      System.out.println(count);
    }
}     
