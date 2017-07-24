import java.io.*;
import java.util.*;

public class PointMain {
   public static void main(String[] args){
      Point a = new Point(1,2);
      Point b = new Point(4,5);
      Point c = new Point(0,0);
    
      List<Point> list = new ArrayList<Point>();
      list.add(a);
      list.add(b);
      list.add(c);
      Collections.sort(list);
      System.out.println(list);
   }
   
}

