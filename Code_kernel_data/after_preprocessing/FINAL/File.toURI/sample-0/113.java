public class func{
public void testAmbiguous01(){
        extractor.setPhysicalAddress(new File(AMBIGUOUS_LOCATION).toURI());
        OWLOntologyID id = extractor.getOntologyId();
        assertTrue(id.getOntologyIRI().toString().equals(AMBIGUOUS_NAME));
        assertTrue(id.getVersionIRI() == null);
}
}
