public class main {

    public A(){
        int[] ay = {10, 30, 40, 20};
        System.out.print(algorithm(4, ay));
    }

    public int algorithm(int n, int[] h){
        int[] Table = new int[n];
        Table[0] = 0;
        if (n <= 1){ //basecase 1
            return Table[0];
        }
        Table[1] = Math.abs(h[0]-h[1]);
        if (n == 2){ //basecase 2
            return Table[1];
        }
        for (int i = 2; i < n; i++){
            if (Math.abs(h[i-2]-h[i]) < Math.abs(h[i-1]-h[i])){
                Table[i] = Table[i-2] + Math.abs(h[i-2]-h[i]);
            }
            else {
                Table[i] = Table[i-1] + Math.abs(h[i-1]-h[i]);
            }
        }
        return Table[n-1];
    }
}