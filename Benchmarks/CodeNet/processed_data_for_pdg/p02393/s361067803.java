public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        Arrays.sort(array);
        for(int i = 0; i < 3; i++){
           if(i < 2){
               System.out.print(array[i] + " ");
              }else{
               System.out.print(array[i]);
              }
        }  
        System.out.println();
        scanner.close();
    }
}
