public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
      	int b = sc.nextInt();
      	int res = 0;
      	res = a > b ? a-- : b--;
        res += Math.max(a, b);
      	System.out.println(res);
    }
}
