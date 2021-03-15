package Week1.Painting_Shapes;

public abstract class Shape {
    protected String name;
    String toString;
    public abstract double area();
    
    public Shape (String eName){
        this.name = eName;
    }
    
    @Override
    public String toString(){
        return "\nShape Name: "+name;
    }
}