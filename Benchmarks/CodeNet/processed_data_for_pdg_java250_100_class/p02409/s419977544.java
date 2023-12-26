public class Main {
    public static void main(String[] args)throws Exception {
        int[][][] array_House = new int[4][3][10];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x = 0; x < n; x++) {
            int b = sc.nextInt() - 1;
            int f = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            int v = sc.nextInt();
            if(array_House[b][f][r] + v > 9){
                array_House[b][f][r] = 9;
            }else if(array_House[b][f][r] < 0){
                array_House[b][f][r] = 0;
            }else{
                array_House[b][f][r] += v;
            }
        }
        sc.close();
        for (int i = 0; i < array_House.length; i++) {
            for (int j = 0; j < array_House[i].length; j++) {
                for (int j2 = 0; j2 < array_House[i][j].length; j2++) {
                    System.out.print(" " + array_House[i][j][j2]);
                }
                System.out.println();
            }
            if (i < array_House.length - 1) {
                System.out.println("####################");
            }
        }
    }
}
