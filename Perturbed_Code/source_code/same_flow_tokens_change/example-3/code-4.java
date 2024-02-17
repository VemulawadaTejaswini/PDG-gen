public class ExampleFourJava {
    public static void main(String[] args) {
        RandomInput randomNumberGenerator = new RandomInput();
        System.out.println("Provide a numeric value: ");
        int randomValue = randomNumberGenerator.generateInt();
        handleData(randomValue);
    }
    private static void handleData(int result) {
        System.out.println("Handling the result: " + result);
    }
}
