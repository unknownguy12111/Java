class A{
    public void method1(){
        System.out.println("I am a method of base class");
    }
}
class B extends A{
    public void mmethod2(){
        System.out.println("I am a method of derived class!!");
    }
    @Override
    public void method1(){
        System.out.println("I am a method of Derived class");
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        A a = new A();
        a.method1();
        B b = new B();
        b.method1();
    }
}
