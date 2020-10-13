/**
 * method to print last digit of number
 * @author Darian
 */
public class Main {
  // method lastDigit to find last digit in num
  public static int lastDigit(int num){
    // digit will store the remainder of num
    int digit = (num % 10);
    // this return will return us the last digit
    return digit;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // store method into variable so it can be printed to screen
    int last = lastDigit(-1183);
    // this will print the last digit to the screen
    System.out.println(last);
  }
}
