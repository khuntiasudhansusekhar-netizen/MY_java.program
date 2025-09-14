class Calculator
{
    public int add(int a ,int b)
    {
        return a + b;

    }
   public double add ( double a,double b){
    return a+b;
   }
   public float add(float a, float b)
   {
    return a+b;
   }

}
public class Overloading{
    public static void main (String [] args)
    {
        Calculator cal = new Calculator();
        System.out.println("add (int, int)->" +cal.add(10,20));
        System.out.println("add (double , double )->" +cal.add(3.5f,3.3f));
        System.out.println("add (float, float)->" +cal.add(34.5f,353.3f));
    }
}