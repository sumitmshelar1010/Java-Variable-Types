package MainPackage.JavaBasics.variables.instancevariable;

public class InstanceVarDefaultValue {//Default value of Instance variable
                                      // stored in heap memory
    int a ;
    boolean b;
    double d;
    float f ;
    String s;
    public static void main(String[] args){
        InstanceVarDefaultValue  t = new InstanceVarDefaultValue ();
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.d);
        System.out.println(t.f);
        System.out.println(t.s);
    }
}
