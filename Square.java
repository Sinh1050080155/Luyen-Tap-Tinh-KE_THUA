package LuyentapCHAPTER4_KETHUA;

public class Square extends Rectangle{
    private Double side;
    public Double getSide() {
        return side;
    }
    public void setSide(Double side) {
        this.side = side;
    }
    
    public Square(String color, boolean filled, double width, double length, double side) {
        super(color, filled, width, length);
        this.side = side;
    }
    public void setWidth(double side) {
        System.out.println(this.side = side);
        
    }
    public void setLength(double side) {
        System.out.println(this.side = side);
    }
    public String toString() {
        return "Square(" + side+ "," +getColor()+", " + filled+ ", "+ getWidth()+", "+ getLength()+ ")";
    }
}