import java.util.*;
public class circle {    
    private double radius;
    public void setradius(Double r){
        radius = r;
    }
    public Double calculateArea(){
        return Math.PI*radius*radius;
    }
}
class circlearea{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       circle c1= new circle();
       System.out.println("Enter the radius of the circle:");
       double radius = sc.nextDouble();
       c1.setradius(radius);
       double area = c1.calculateArea();
       System.out.printf("The area of the circle with radius %.2f is %.2f%n",radius,area);
    }
}