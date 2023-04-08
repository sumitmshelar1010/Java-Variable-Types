package MainPackage.JavaBasics.variables.localvariable;

public class LocalFinalVariable { // use of Final Modifier in Local variable
    public static void main(String[] args) {
        int z;
        z = 20;
        z = 10;// we can again declare value of local variable in next line after once declared
        System.out.println(z);
        {method1();} {m2();}
    }

        public static void method1() {
            final int z = 50;// we can not again declare value of final local variable in next line after once declared
            System.out.println(z);
        }
        public static void m2 () {
            int z = 100;
            System.out.println(z);
        }
    }

