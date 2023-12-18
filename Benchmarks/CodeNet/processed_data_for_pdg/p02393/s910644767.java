public class Main {
    public static void main(String[] args) throws Exception {
     Scanner scan = new Scanner(System.in);
     int[] a = new int[3];
     int temp =0 ;
     for (int i =0; i<3; i++){
         a[i] = scan.nextInt();
     }
     for (int i= 2; i >0 ;i--){
         for (int j = 0; j<2;j++){
             if (a[j] > a[i]){
                temp = a[j];
                 a[j] = a[i];
                 a[i] = temp;
             }
         }
     }
        System.out.println(a[0] +" " + a[1] + " " + a[2]);
    }
}
