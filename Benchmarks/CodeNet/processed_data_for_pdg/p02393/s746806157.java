public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int ans[] = new int[3];
      for(int i = 0; i < 3;i++){
          ans[i] = sc.nextInt();
      }
     Arrays.sort(ans);
     System.out.println(ans[0]+" "+ans[1]+" "+ans[2]);
	 sc.close();
	}
}
