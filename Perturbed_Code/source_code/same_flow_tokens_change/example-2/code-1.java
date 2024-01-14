public class ComplexProgram {
    public static void main(String[] args) {
        AdvancedInput advancedInput = new AdvancedInput();
        System.out.println("Enter the base number: ");
        double base = advancedInput.readDouble();
        System.out.println("Enter the exponent: ");
        double exponent = advancedInput.readDouble();
        double result = Math.pow(base, exponent)
        System.out.println("The result is: " + result);
    }
}
