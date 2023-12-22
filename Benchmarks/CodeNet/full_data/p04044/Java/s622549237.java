public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        List<String> data= new ArrayList<>();
        for (int i = 0; i < k; i++) {
            data.add(in.nextLine());
        }
        System.out.println(data.stream().sorted().collect(Collectors.joining("")));
      
    }
  }