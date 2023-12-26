public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String[] array = s.split("");
        boolean c = false;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i].equals(array[i+1])) {
                c = true;
            }
        }
        if (c) {
            System.out.println("Bad");
        } else {
            System.out.println("Good");
        }
    }
}
