public class Main {
	public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int i = sc.nextInt();
       List<String> tinko = new ArrayList<>();
       for(int t = 0;t < i;t++){
           tinko.add(sc.next());
       }
       Long kosuu = tinko.stream().distinct().count();
       System.out.println(kosuu);
    }
}
