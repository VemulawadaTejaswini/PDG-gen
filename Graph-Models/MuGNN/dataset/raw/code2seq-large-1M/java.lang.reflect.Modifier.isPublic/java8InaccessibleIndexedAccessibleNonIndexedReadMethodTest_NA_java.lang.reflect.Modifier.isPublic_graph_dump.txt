Line_2 $$ public void java8InaccessibleIndexedAccessibleNonIndexedReadMethodTest() throws TemplateModelException --> Line_3 $$ assertTrue("This test case must be ran on Java 8 or later", _JavaVersions.JAVA_8 != null) [CD]
Line_2 $$ public void java8InaccessibleIndexedAccessibleNonIndexedReadMethodTest() throws TemplateModelException --> Line_4 $$ assertFalse(Modifier.isPublic(BeanWithInaccessibleIndexedProperty.class.getModifiers())) [CD]
Line_6 $$ BeansWrapper bw = new BeansWrapper(ici) --> Line_7 $$ TemplateHashModel beanTM = (TemplateHashModel) bw.wrap(new BeanWithInaccessibleIndexedProperty()) [FD]
Line_7 $$ TemplateHashModel beanTM = (TemplateHashModel) bw.wrap(new BeanWithInaccessibleIndexedProperty()) --> Line_8 $$ TemplateModel fooTM = beanTM.get("foo") [FD]
Line_8 $$ TemplateModel fooTM = beanTM.get("foo") --> Line_9 $$ assertThat(fooTM, instanceOf(TemplateSequenceModel.class)) [FD]
Line_7 $$ TemplateHashModel beanTM = (TemplateHashModel) bw.wrap(new BeanWithInaccessibleIndexedProperty()) --> Line_12 $$ TemplateModel barTM = beanTM.get("bar") [FD]
Line_12 $$ TemplateModel barTM = beanTM.get("bar") --> Line_13 $$ assertNull(barTM) [FD]
