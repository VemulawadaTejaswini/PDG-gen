public class AnotherComplexProgram {
    public static void main(String[] args) {
        ComplexInput complexInput = new ComplexInput();
        System.out.println("Insert the base value: ");
        double baseValue = complexInput.getDouble();
        System.out.println("Provide the exponent: ");
        double exp = complexInput.getDouble();
        double finalResult = Math.pow(base, exponent)
        System.out.println("Final outcome: " + finalResult);
    }
}
