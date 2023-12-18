class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int givenNumber = scan.nextInt();
        if (givenNumber >= 1 && givenNumber <= 100) {
            System.out.println((int)Math.pow(givenNumber, 3));
        }
    }
}
