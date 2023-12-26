public class Main {
	public static void main(final String[] args){
    final Scanner sc = new Scanner(System.in);
    final List<Integer> list = new ArrayList<>();
    int n = sc.nextInt();
    int x = sc.nextInt();
    int count = 0;
    for(int i = 0 ; i < n ; i++){
        list.add(sc.nextInt());
        x -= list.get(i);
        count++;
    }
    Collections.sort(list);
    count += x / list.get(0);
    System.out.println(count);
}
}
