package com.sootanalysis;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import sootup.core.Project;
import sootup.core.inputlocation.AnalysisInputLocation;
import sootup.core.jimple.common.stmt.Stmt;
import sootup.core.model.SootClass;
import sootup.core.model.SootMethod;
import sootup.core.signatures.MethodSignature;
import sootup.core.types.ClassType;
import sootup.core.views.View;
import sootup.java.core.JavaProject;
import sootup.java.core.JavaSootClass;
import sootup.java.core.JavaSootClassSource;
import sootup.java.core.language.JavaLanguage;
import sootup.java.core.views.JavaView;
import sootup.java.sourcecode.inputlocation.JavaSourcePathAnalysisInputLocation;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        AnalysisInputLocation<JavaSootClass> inputLocation = new JavaSourcePathAnalysisInputLocation(
                "D:\\IIT Hyderabad\\Research\\API misuse prediction\\Repository\\Soot-Analyzer\\pdg\\src\\main\\java\\com\\sootanalysis\\Examples");

        JavaLanguage language = new JavaLanguage(8);
         
        Project project = JavaProject.builder(language).addInputLocation(inputLocation).build();

        View view = project.createView();
        ClassType classType = project.getIdentifierFactory().getClassType("com.sootanalysis.Examples.sample_0");
        SootClass<JavaSootClassSource> sootClass = (SootClass<JavaSootClassSource>) view.getClass(classType).get();

        MethodSignature methodSignature = project.getIdentifierFactory().getMethodSignature(classType, "main", "void", Collections.singletonList("java.lang.String[]"));
        
        Optional<? extends SootMethod> opt = sootClass.getMethod(methodSignature.getSubSignature());
        SootMethod method;
        if(opt.isPresent()){
            method = opt.get();
            List<Stmt> stmts = method.getBody().getStmts();
            System.out.println(stmts);
        }
        
        System.out.println("End!");
    }
}
