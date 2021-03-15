package Week1.Painting_Shapes;

public class Paint {
    private double coverage;
    public Paint(double c){
        this.coverage = c;
    }
    public double amount (Shape s){
        System.out.println("Computing amount for " + s);
        return s.area()/coverage;
    }
}