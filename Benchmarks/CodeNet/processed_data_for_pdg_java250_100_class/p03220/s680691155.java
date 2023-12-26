public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        int[] hArr = new int[N];
        for (int i = 0; i < hArr.length; i++) {
            hArr[i] = sc.nextInt();
        }
        sc.close();
        double ht;               
        double dif = 0;          
        double min = 100000000;  
        int hn  = 0;             
        for (int i = 0; i < hArr.length; i++) {
            ht = T - (hArr[i] * 0.006);
            dif = Math.abs(A - ht);
            if(min > dif) {
                hn = i;
                min = dif;
            };
        }
        System.out.println(hn + 1);
    }
}
