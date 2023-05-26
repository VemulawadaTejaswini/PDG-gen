public class func{
public void testAbsoluteURI(){
        File tazbm = new File(root, "wcs/BlueMarble.tiff");
        StringValidatable validatable = new StringValidatable(tazbm.toURI().toString());
        validator.validate(validatable);
        assertTrue(validatable.isValid());
}
}
