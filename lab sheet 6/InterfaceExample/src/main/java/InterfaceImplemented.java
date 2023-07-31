 public class InterfaceImplemented implements MyFirstInterface {

    @Override
    public void display() {
        x =20; // This will cause a compile-time error. You cannot change the value of 'x'.
        System.out.println("Value of x inside display(): " + x);
    }
}

    

