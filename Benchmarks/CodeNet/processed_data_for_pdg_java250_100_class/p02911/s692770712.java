public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int point = sc.nextInt();
        int wnum = sc.nextInt();
        int win[] = new int[n];
        for(int i = 0;i<wnum;i++){
            win[sc.nextInt()-1]++;
        }
        for(int i = 0;i<n;i++){
            if(point + win[i] > wnum) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
