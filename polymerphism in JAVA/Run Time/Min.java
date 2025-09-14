class Bike{
    void run()
    {
        System.out.println("Running-----");

    }
}
class Splender extends Bike{
    void run(){
        System.out.println("BIke is running safetely with 40KMH");
    }
}
public class Min{
    public static void main(String args[])
    {
        Bike b = new Splender();
        b.run();

    }
}