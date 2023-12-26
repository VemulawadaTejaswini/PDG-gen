public class Main {
	public static void main(final String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int count = 0;
    for(int i = 0 ; i < x + 1; i++){
        int checker = i * 2 + (x - i) * 4;
        if(checker == y){
            count++;
        }
    }
    if(count == 0){
        System.out.println("No");
    }else{
        System.out.println("Yes");
    }
	}
}
