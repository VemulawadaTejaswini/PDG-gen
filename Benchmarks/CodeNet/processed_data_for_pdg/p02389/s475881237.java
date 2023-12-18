class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int tate, yoko, menseki, syuu;
        tate = stdIn.nextInt();
        yoko = stdIn.nextInt();
        menseki = tate * yoko;
        syuu = (tate + yoko) * 2;
        System.out.printf(menseki + " " + syuu + "\n");
    }
}
