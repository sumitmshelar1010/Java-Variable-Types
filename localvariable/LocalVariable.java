package MainPackage.JavaBasics.variables.localvariable;

public class LocalVariable { //Local Variables are use only for method in which it declared
    public static void main(String[] args){
        int a =10 ; //Local Variable
        System.out.println(a);
        method1();
    }
    public static void method1(){
        int a=20; //Local Variable
        System.out.println(a);
    }
}
// when we want to use the variable only inside the method then we can use local MainPackage.JavaBasics.operators.variables.