public class Main {
	public static void main(final String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[100000];
    int list2[] = new int[100000];
    int check = 1;
    for(int i = 0; i < n ; i++){
        list[i] = sc.nextInt();
    }
    for(int i = 0 ; i < n ; i++){
        list2[list[i]-1] = check;
        check++;
    }
    for(int i = 0; i < n ; i++){
        System.out.print(list2[i] + " ");
    }
	}
}
