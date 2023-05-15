public class dummy {
public TextTable<T> loadFile(File file, boolean rewriteIfChanged) throws IOException {
    String oldContent = "";
    if (file == null)
      throw new IllegalArgumentException("Cannot load a null file"); 
    if (file.exists()) {
      oldContent = FileUtils.readFileToString(file);
      loadString(oldContent);
    } 
    String currentText = toString();
    if (rewriteIfChanged && (!file.exists() || !oldContent.equals(currentText)))
      FileUtils.writeStringToFile(file, currentText); 
    return this;
  }
}