public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
        int y = sc.nextInt();
        int turu = 0, kame = x;
        while(kame >= 0){
          if(turu * 2 + kame * 4 == y){
            System.out.println("Yes");
            System.exit(0);
          }
          kame--;
          turu++;
        }
        System.out.println("No");
    }
}
