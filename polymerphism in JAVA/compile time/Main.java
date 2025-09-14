/*java program for Method overlading*/
class MultiplyFun{
    static int Multiply(int a, int b)
    {
        return a*b;

    }
    static double Multiply( double a , double b, double c)
    {
        return a*b*c;
    }
}
public class Main{
    public static void main(String [] args){
        System.out.println(MultiplyFun.Multiply(120,354));
        System.out.println(MultiplyFun.Multiply(345.3,234.34,3445.3));
    }
}