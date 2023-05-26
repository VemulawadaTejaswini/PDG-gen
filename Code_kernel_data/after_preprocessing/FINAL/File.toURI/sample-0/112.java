public class func{
public void testPizza02(){
        extractor.setPhysicalAddress(new File(PIZZA_LOCATION).toURI());
        OWLOntologyID id = extractor.getOntologyId();
        assertTrue(id.getOntologyIRI().toString().equals(PIZZA_NAME));
        assertTrue(id.getVersionIRI() == null);
}
}
