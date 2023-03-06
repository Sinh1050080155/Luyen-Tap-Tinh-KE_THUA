package LuyentapCHAPTER4_KETHUA;

public class Circle extends shape{
    private Double radius;
    private Double PI = 3.14;
    public Double getPI() {
        return PI;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        if(radius <= 0){
            System.out.println("Khong hop le!");
        }
        this.radius = radius;
        System.out.println("CHU VI HINH TRON: "+(radius * PI *2));
        System.out.println("DIEN TICH HINH TRON:"+(radius * radius * PI));
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius; 
    }
    public String toString(){
        return "Circle (" + radius + ", " + getColor() + ", " + filled+ ")";
    }
}
