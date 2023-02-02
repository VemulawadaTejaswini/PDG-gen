//48
public class func{
public void loadModel(BufferedReader reader){
    double globalAverage = Double.parseDouble(reader.readLine());
    double[] itemBiases = VectorExtensions.readVectorArray(reader);
    reader.close();
}
}
