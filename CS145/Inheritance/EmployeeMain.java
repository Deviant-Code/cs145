public class EmployeeMain{

         public static void main(String[] args){
         
                  Employee robert = new Employee();
                  System.out.println(robert);
                  LegalSecretary sawyer = new LegalSecretary();
                  
                  System.out.println();
                  
                  printSalary(robert);
                  printSalary(sawyer);
         }
         
         public static void printSalary(Employee e) {
               System.out.println(e.getSalary());
         }
}


/*

A: 
1   A 1
2   A 2
tS  A

B
1. A 1
2  B 2
tS A

C.
1. C 1
2. A 2
tS C

D
1. C 1
2. D 2
tS C

*/