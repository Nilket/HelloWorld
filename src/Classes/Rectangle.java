package Classes;

public class Rectangle { //Objektet
   private double length;
   private double width;

// Constructor
   public Rectangle(){
        length = 0;
        width = 0;

   }
//Constuctor
   public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
   }
//Metoder
    public double calculatePerimeter(){
        return(2*length) + (2 * width);
    }

    public double calculateArea(){
        return (length * width);

    }

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
}
