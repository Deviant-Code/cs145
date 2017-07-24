public class Circle {

         private int radius;
         
         public Circle(int r) {
         
                 radius = r;    
          }
          
          public double  getArea() {
          
                  return Math.PI * r * r;       
           }
           
           public double getPerimeter() {
                   return 2.0 * Math.PI * r;
           }
}