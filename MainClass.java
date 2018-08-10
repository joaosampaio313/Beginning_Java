
public class MainClass{
    private double x;
    private double y;
    
    public MainClass(double x, double y){
      this.x = x;
      this.y = y;
    }
    
    public double getAverage(){
        return x + y / 2;
    
    }
    
    public void setNum(double x, double y){
        this.x = x;
        this.y = y;
    }
}  
