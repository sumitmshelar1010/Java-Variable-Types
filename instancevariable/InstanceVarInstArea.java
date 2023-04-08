package MainPackage.JavaBasics.variables.instancevariable;

public class InstanceVarInstArea { //Instance MainPackage.JavaBasics.operators.variables can access from instance area
                                   //Value of variable varied from object to object
    int a = 10;

    public static void main(String[] args) {
        InstanceVarInstArea t1 = new InstanceVarInstArea();
        InstanceVarInstArea t2 = new InstanceVarInstArea();
        System.out.println(t1.a);
        System.out.println(t2.a);
    }
    {method1();} // Introduced New method under main method
    public void method1() { //Nonstatic instance area
        System.out.println(a);
    }
}
