public class Main {
	public static void main(final String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    List<Integer> list = new ArrayList<>();
    while (n > 0) {
        list.add(n % 10);
        n /= 10;
    }
    for(int i = 0; i < list.size(); i++){
        if(list.get(i).equals(7)){
            count++;
        }
    }
    if(count > 0){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
	}
}
