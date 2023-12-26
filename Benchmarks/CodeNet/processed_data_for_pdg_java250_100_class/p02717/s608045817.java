class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int boxA = scn.nextInt();
        int boxB = scn.nextInt();
        int boxC = scn.nextInt();
        int boxCopy = boxA;
        boxA = boxB;
        boxB = boxCopy;
        boxCopy = boxA;
        boxA = boxC;
        boxC = boxCopy;
        System.out.println(boxA +" " + boxB + " " + boxC);
    }
}
