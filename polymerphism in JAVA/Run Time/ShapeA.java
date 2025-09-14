class Shape{
    void draw()
    {
        System.out.println("The shape is different things");

    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("The Shape of rectangle is eval length opposite side");

    }
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("This shape of circle is round");
    }
}
class Triangle extends Shape{
    void draw()
    {
        System.out.println("The shape of triangle is trieds");
    }
}
public class ShapeA{
    public static void main(String args[])
 {
    Shape sh;
    sh = new Rectangle();
    sh.draw();
    sh = new Circle();
    sh.draw();
    sh = new Triangle();
    sh.draw();

 }   
}
