package Week1.Painting_Shapes;

public class Sphere extends Shape {
    private double radius; //radius in feet
    
    public Sphere(double r){
        super("Sphere");
        radius = r;
    }
    public double area(){
        return 4*Math.PI*radius*radius;
    }
    @Override
    public String toString(){
        return super.toString() + "\n" + "of radius " +radius;
    }
}
