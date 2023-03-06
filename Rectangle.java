package LuyentapCHAPTER4_KETHUA;

public class Rectangle extends shape{
    private Double width;
    public Double getWidth() {
        return width;
    }
    public void setWidth(Double width) {
        this.width = width;
    }
    private Double length;
    public Double getLength() {
        return length;
    }
    public void setLength(Double length) {
        this.length = length;
    }
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
       this.width = width;
       this.length = length;
    }
    public Double getArea(){
        return getArea();
    }
    public Double getPerimeter(){
        return getPerimeter();
    }
    public String toString(){
        return "Rectangle"+ width + " " + length; 
    }
    
    
}
