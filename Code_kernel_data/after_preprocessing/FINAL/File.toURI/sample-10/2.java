public class func{
public void upload(ImageUpload upload){
      checkDirectory(upload);
      File file = new File(LOCAL_IMAGE_DIR, FileUtils.generateFileName(upload));
      ImageIO.write(upload.getImage(), "png", file);
      return file.toURI().toURL().toString();
}
}
