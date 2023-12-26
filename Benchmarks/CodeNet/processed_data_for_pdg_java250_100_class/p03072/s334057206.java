public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int mounts[] = new int[a];
        int max = 0;
        int count = 0;
        for (int i = 0; i < a; i++) {
          mounts[i] = s.nextInt();
          if (mounts[i] >= max) {
            max = mounts[i];
            count++;
          }
        }
        System.out.println(count);
    }
}
