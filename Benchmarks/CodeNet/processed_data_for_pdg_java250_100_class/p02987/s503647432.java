public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String[] array =  s.split("");
        Arrays.sort(array); 
        if(array[0].equals(array[1]) && array[2].equals(array[3]) && !array[0].equals(array[3])){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
