public class Square {

         private int length;
         
         public void square(int l) {
         
                  length = l;        
         }        
         
         public double getArea() {
                  return 1.0 * length * length;
         }
         
         public double getPerimeter(){
                  return 4.0 * length;
         }
}