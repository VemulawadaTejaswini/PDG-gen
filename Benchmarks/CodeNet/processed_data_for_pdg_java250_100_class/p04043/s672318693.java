public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int five = 0;
        int seven = 0;
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < a.length; i++){
            if(a[i] == 5){
                five++;
            } else if(a[i] == 7){
                seven++;
            }
        }
        if(five == 2 && seven == 1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
