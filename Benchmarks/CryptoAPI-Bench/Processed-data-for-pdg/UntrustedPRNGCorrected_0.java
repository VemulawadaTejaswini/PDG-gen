public class Dummy {
    public static void main(String [] args)
    {
        SecureRandom random = new SecureRandom();
        PBEParameterSpec pbeParamSpec = null;
        byte[] salt = new byte[32];
        random.nextBytes(salt);
        int count = 10020;
        pbeParamSpec = new PBEParameterSpec(salt, count);
    }
}
