class Test01 {
    public static void main(String[] args) {
        int result = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
        System.out.println(result % 2 == 0 ? "Even" : "Odd");
    }
}