//110
public class func{
public void testVersioned04(){
        extractor.setPhysicalAddress(new File(VERSIONED_LOCATION2).toURI());
        OWLOntologyID id = extractor.getOntologyId();
        assertTrue(id.getOntologyIRI().toString().equals(VERSIONED_NAME));
        assertTrue(id.getVersionIRI().toString().equals(VERSIONED_VERSION));
}
}
