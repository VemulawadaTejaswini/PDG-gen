public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i=0;i<m;i++){
            arr.add(sc.nextInt());
        }
        int tmp1 = 0, tmp2 = 0;
        for(Integer value : arr){
            if (value < x){
                tmp1++;
            }else{
                tmp2++;
            }
        }
        System.out.println(Math.min(tmp1,tmp2));
    }
}
