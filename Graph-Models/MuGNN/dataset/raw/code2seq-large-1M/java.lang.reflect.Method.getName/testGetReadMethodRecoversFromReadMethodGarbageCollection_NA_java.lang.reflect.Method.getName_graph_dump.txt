Line_2 $$ public void testGetReadMethodRecoversFromReadMethodGarbageCollection() throws Exception --> Line_3 $$ initializePropertyDescriptor() [CD]
Line_2 $$ public void testGetReadMethodRecoversFromReadMethodGarbageCollection() throws Exception --> Line_4 $$ Method method = javaBeanPropertyDescriptor.getReadMethod() [CD]
Line_2 $$ public void testGetReadMethodRecoversFromReadMethodGarbageCollection() throws Exception --> Line_5 $$ assertEquals("incorrect method found", "getDestField", method.getName()) [CD]
Line_4 $$ Method method = javaBeanPropertyDescriptor.getReadMethod() --> Line_5 $$ assertEquals("incorrect method found", "getDestField", method.getName()) [FD]
