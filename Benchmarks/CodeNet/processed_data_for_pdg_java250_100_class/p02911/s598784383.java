class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] score = new int[100010];
        int q = sc.nextInt();
        for (int i=0;i<n;i++) {
           score[i] = k-q;
        }
        for (int i=0;i<q;i++) {
           score[sc.nextInt()-1] ++;
        }
        for (int i=0;i<n;i++) {
          if(score[i]>0) System.out.println("Yes");
          else System.out.println("No");
        }
    }
}
