class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] array = str.split(" ");
        int a = Integer.parseInt(array[0]), b = Integer.parseInt(array[1]);
        System.out.println(a * b + " " + (a * 2 + b * 2));
    }
}
