public class power {

 public static void main(String[] args) {

  int basenumber = 4, exponent = 2;
  long temp = 1;

  while (exponent != 0) {
   temp *= basenumber;
   --exponent;
  }

  System.out.println("Result: " + temp);
 }
}