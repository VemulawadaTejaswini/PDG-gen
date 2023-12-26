public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int L = input.nextInt();
        String a[] = new String[N];
        String s;
        for(int i = 0; i <N; i++){
            s = input.next();
                a[i]=s;
        }
        Arrays.sort(a);
        for (String a1 : a) {
            System.out.print(a1);
        }
        System.out.println();
    }
}
