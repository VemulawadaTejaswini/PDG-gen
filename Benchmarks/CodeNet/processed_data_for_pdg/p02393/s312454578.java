public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int[] array = new int[3];
        for (i = 0; i < 3; i++) {
            array[i] = sc.nextInt();
        }
        int j;
        int k;
        int z;
        for(j=0;j<2;j++){
            for(k=0;k<2;k++){
                if(array[k]>array[k+1]){
                    z = array[k];
                    array[k] = array[k+1];
                    array[k+1] = z;
                }
            }
        }
        for(i=0;i<2;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(array[2]);
    }
}
