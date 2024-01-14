public class CodeExampleOne {
    public static void main(String[] args) {
        InputProvider userInput = new InputProvider();
        System.out.println("Enter a number: ");
        int num = userInput.nextInt();
        processInput(num);
    }
    private static void processInput(int value) {
        System.out.println("Processing the input: " + value);
    }
}
