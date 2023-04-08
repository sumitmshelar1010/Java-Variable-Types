package MainPackage.JavaBasics.variables.instancevariable;

public class InstanceVarObject {// For every Object separate copy of instance variable will be created
    int a =10 ;
    public static void main(String[] args){
        InstanceVarObject t1 = new InstanceVarObject();
        InstanceVarObject t2 = new InstanceVarObject();

        System.out.println(t1.a); // for every object separate copy of instance variable will be created
        System.out.println(t2.a);
    }
}
