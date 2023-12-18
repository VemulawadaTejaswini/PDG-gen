public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num;
        num = new int[3];
        int i, j, t;
        String line = sc.next();
        num[0] = Integer.parseInt(line);
        line = sc.next();
        num[1] = Integer.parseInt(line);
        line = sc.next();
        num[2] = Integer.parseInt(line);
        for(i=0; i<2; i++){
            for(j=2; j>i; j--){
                if(num[j-1] > num[j]){
                    t = num[j]; num[j] = num[j-1]; num[j-1] = t;
                }
            }
        }
        System.out.println(num[0]+ " " +num[1] + " " + num[2]);
        sc.close();
    }
}
