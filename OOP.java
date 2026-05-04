//Single level Inheritance
class Shape{
    public void area(){
        System.out.println("display area");
    }
    //String color;
    }
//Multilevel Inheritance
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
//hierarchical Inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
//class EquilateralTriangle extends Shape{

   // public void area(int l, int h){
     //   System.out.println(1/2*l*h);
   // }
//}

public class OOP {
    public static void main(String[] args) {
       // Triangle t1=new Triangle();
        //t1.color="red";
        //System.out.println(t1.color);
    }    
}
