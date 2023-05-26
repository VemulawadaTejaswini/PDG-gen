//160
public class func{
public void run(){
        BufferedReader bufferedReader = new BufferedReader(reader);
        for (readResult = bufferedReader.read(buffer);readResult>=0;readResult = bufferedReader.read(buffer))
        {
          processOutputStreamWriter.write(buffer, 0, readResult);
        }
        processOutputStreamWriter.close();
}
}
