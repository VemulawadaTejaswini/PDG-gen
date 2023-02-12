public class func{
public void accept(final File parentDir,final String fileName){
        final File descriptionFile = new File(parentDir, fileName);
        if (PCGFile.isPCGenListFile(descriptionFile))
        {
          BufferedReader descriptionReader = null;

          try
          {
            if (descriptionFile.exists())
            {
              final char[] inputLine;

              descriptionReader = new BufferedReader(new InputStreamReader(new FileInputStream(
                  descriptionFile), "UTF-8"));

              final int length = (int) descriptionFile.length();
              inputLine = new char[length];
              descriptionReader.read(inputLine, 0, length);
              setDescriptionLst(getDescriptionLst() + new String(inputLine));
            }
          } catch (IOException exception)
          {
            Logging.errorPrint("IOException in PlayerCharacter.loadDescriptionFilesInDirectory", exception);
          } finally
          {
            if (descriptionReader != null)
            {
              try
              {
                descriptionReader.close();
              } catch (IOException e)
              {
                Logging.errorPrint(
                    "Couldn't close descriptionReader in PlayerCharacter.loadDescriptionFilesInDirectory",
                    e);

              }
            }
          }
        } else if (parentDir.isDirectory())
        {
          loadDescriptionFilesInDirectory(parentDir.getPath() + File.separator + fileName);
        }
}
}
