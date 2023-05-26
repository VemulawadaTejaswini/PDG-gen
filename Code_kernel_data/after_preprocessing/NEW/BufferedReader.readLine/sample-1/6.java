//6
public class func{
public void readFileToVector(String file){
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        while ((line = buffer.readLine()) != null) {
            String[] arr = line.split(",");
            vectors.add(new DenseVector(new double[] { Double.parseDouble(arr[0]), Double.parseDouble(arr[1]) }));
        }
        buffer.close();
}
}
