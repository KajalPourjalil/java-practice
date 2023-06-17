import java.util.*;


public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        this("white", false);
        dateCreated = new Date();

    }

    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public void setColor(String color){
        this.color = color;
    }

    
    public String getColor(){
        return color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public boolean isFilled(){
        return filled;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){
        return ("created on " + getDateCreated() + " the color is " + getColor() + " filled " + isFilled());
    }





}