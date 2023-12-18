public class Main {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i = 0; i<3; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
            System.out.printf("%d %d %d\n", a[0], a[1], a[2]);
            sc.close();
    }
}
