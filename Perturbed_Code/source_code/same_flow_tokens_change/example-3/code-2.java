public class AnotherCodeExample {
    public static void main(String[] args) {
        CustomReader inputReader = new CustomReader();
        System.out.println("Input an integer: ");
        int inputValue = inputReader.readInt();
        executeOperation(inputValue);
    }
    private static void executeOperation(int data) {
        System.out.println("Executing operation with data: " + data);
    }
}
