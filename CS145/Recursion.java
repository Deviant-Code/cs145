public class Recursion {

   public static void main(String[] args){
      doubleReverse("hello", 0);
   }
   
   public static void doubleReverse(String s, int i){
        if(!(i >= s.length())){
           doubleReverse(s, i+1);
           System.out.print(s.charAt(i));
           System.out.print(s.charAt(i));
        }
   }
 
}