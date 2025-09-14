class A{
    private A();

}
A()
{
    System.out.println("Hellow world");

}
public static void main(String [] args)
{
    A obj = new A();
    obj.msg();
}
