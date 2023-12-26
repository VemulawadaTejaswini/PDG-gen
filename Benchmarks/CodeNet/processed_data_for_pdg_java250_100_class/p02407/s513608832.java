public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
        a[i] = sc.nextInt();
        }
        String delimitor = "";
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(delimitor);
            System.out.print(a[i]);
            delimitor = " ";
        }
        System.out.printf("\n");
        sc.close();
        }
        }
