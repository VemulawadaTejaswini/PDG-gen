public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int K = sc.nextInt(); 
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < K; i++){
          int a = sc.nextInt();
          for(int j = 0; j < a; j++){
            int num = sc.nextInt();
            if(!array.contains(num))
              array.add(num);
          }
        }
        System.out.println(N-array.size());
    }
}
