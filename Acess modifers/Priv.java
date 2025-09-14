class A 
{
    private int data = 50;
    private void message()
    {
        System.out.println("Hellow World "  );

    }
}
public class priv{
    public static void main(String [] args)
    {
        A obj = new A();
        System.out.println(obj.data);
        obj.message();

    }
    
}/*"c:\Users\ASUS\Downloads\Java program\Acess modifers\" ; if ($?) { javac Priv.java } ; if ($?) { java Priv }
Priv.java:10: error: class priv is public, should be declared in a file named priv.java
public class priv{
       ^
Priv.java:14: error: data has private access in A
        System.out.println(obj.data);
                              ^
Priv.java:15: error: message() has private access in A
        obj.message();
           ^
3 errors
*/
