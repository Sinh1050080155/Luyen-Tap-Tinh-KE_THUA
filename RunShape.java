package LuyentapCHAPTER4_KETHUA;

public class RunShape {
    public static void main(String[] args){
        Circle dt1 = new Circle("Red",true,5);
        System.out.println(dt1.toString());
        dt1.setRadius(5.5);
        System.out.println("================================");
        Square dt2 = new Square("Red",true,6.3,2.3,15.3);
        System.out.println(dt2.toString());
        dt2.setLength(15.3);
        dt2.setWidth(15.3);


    }
}
