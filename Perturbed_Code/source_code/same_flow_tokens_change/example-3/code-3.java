public class JavaExampleThree {
    public static void main(String[] args) {
        UserInput inputScanner = new UserInput();
        System.out.println("Please insert a number: ");
        int userInput = inputScanner.readNumber();
        performTask(userInput);
    }
    private static void performTask(int data) {
        System.out.println("Performing the task with data: " + data);
    }
}
