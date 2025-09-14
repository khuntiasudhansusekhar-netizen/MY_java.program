/*operator operator overloading in java*/
class Operator{
    void op(String str1,String str2)
    {
        String s = str1 + str2;
        System.out.println("Concatinated String :-" +s);

    }
    void op(int a,int b)
    {
        int c = a+b;
        System.out.println("Sum = " +c);
    }
}
class OpeOV{
    public static void main( String args[] )
    {
         Operator o = new Operator();
         o.op(34,54);
         o.op("java", "program");

    }
}