public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[3];
        array[0] = sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();
        if(array[0]>array[1]){
            int temp = array[0];
            array[0] = array[1];
            array[1] = temp;
        }
        if(array[1]>array[2]){
            int temp = array[1];
            array[1] = array[2];
            array[2] = temp;
        }
        if(array[0]>array[1]){
            int temp = array[0];
            array[0] = array[1];
            array[1] = temp;
        }
        System.out.println(array[0]+" "+array[1]+" "+array[2]);
    }
}
