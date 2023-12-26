 public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      	int N = scanner.nextInt();
      List <Integer> a = new ArrayList <Integer>();
      int n[] = new int[N];
      for(int i=0; i<N; i++){
        n[i] = 0;
      }
      for(int i=0; i<N-1; i++){
         a.add(scanner.nextInt());
      }
      int b = 0;
      for(int i=0; i<N-1; i++){
        b = a.get(i);
        n[b-1] +=1;
      }
      for(int i=0; i<N; i++){
       System.out.println(n[i]);
      }
    }
 }
