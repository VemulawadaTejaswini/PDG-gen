public class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        boolean[] ppl = new boolean[N];
        s.nextLine();
        for(int i=0; i<K; i++) {
            int quantity = s.nextInt();
            s.nextLine();
            for(int j=0; j<quantity; j++) {
                int idx = s.nextInt();
                ppl[idx-1] = true;
            }
        }
        int count = 0;
        for(boolean b: ppl){
            if(!b)
                count++;
        }
        System.out.println(count);
    }
}
