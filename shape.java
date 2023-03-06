package LuyentapCHAPTER4_KETHUA;

public class shape {
    private String color;
    protected Boolean filled;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public Boolean isBoolean(){
        return filled;

    }

}
