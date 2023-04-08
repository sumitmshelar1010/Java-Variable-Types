package MainPackage.JavaBasics.variables.staticvariable;
//Static MainPackage.JavaBasics.operators.keywords are use for memory management mainly
public class StaticVariableAccess { // Static variable is used when the value of variable is fixed for object to object
                                    // single copy created in class and shared to every object
                                    //We can access either by object reference or by class name
                                    // static MainPackage.JavaBasics.operators.variables stored into method memory
    static int a =10 ;
    public static void main (String[] args){
        StaticVariableAccess t = new StaticVariableAccess();
        System.out.println(t.a);        // with object reference
        System.out.println(StaticVariableAccess.a); // with class reference
        System.out.println(a);          // without class name in within a same class

    }
}
