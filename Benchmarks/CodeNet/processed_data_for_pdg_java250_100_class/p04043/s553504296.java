class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int[] array = {a, b, c};
      int[] anwer = {5, 5, 7};
      Arrays.sort(array);
      if (Arrays.equals(array, anwer))
        System.out.println("YES");
      else
        System.out.println("NO");
    }
}
