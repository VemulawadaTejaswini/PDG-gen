public class Main {
	public static void main(final String[] args){
    final Scanner sc = new Scanner(System.in);
    final List<Integer> list = new ArrayList<>();
    int n = sc.nextInt();
    int count = 1;
    for(int i = 0; i < n ; i++){
        list.add(sc.nextInt());
    }
    int max = list.get(0);
    for(int i = 1; i < n ; i++){
            if(list.get(i) >= max){
                count++;
                max = list.get(i);
            }
    }
    System.out.println(count);
}
}
