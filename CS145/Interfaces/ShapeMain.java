public class ShapeMain {

         public static void main(String[] args) {
               Shape[] s = {new Circle(5), new Square(5)};
               printAreas(s);
         
         }

         public static void printAreas(Shape[] s) {
                  for(Shape shape : s){
                        System.out.println(shape.getArea());
                  }
         }
}