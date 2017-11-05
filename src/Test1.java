
// This program is to calculate the expression of arcsinh(0.5).

public class Test1 {
  
  public static double calculatePowers(double x, int n) {
    double powers = 1;
    for (int i = 0; i < n; ++i) {
      powers *= x;
    }
    return powers;
  }

  public static double calculateFactorial(int n) {
    double factorial = 1;
    for (int i = 0; i < n; ++i) {
      factorial *= i + 1;
    }
    return factorial;
  }
  
  public static double calculateTerm(double x, int n) {
    double a = calculatePowers(-1, n);
    double b = calculatePowers(4, n);
    double c = calculatePowers(x, 2 * n + 1);
    double d = 2* n + 1;
    double e = calculateFactorial(2 * n);
    double f = calculateFactorial(n);
    double term = a * c * e / (b * d * f * f);
    System.out.println("n=" + n + " a=" + a + " b=" + b + " c=" + c + " d=" + d 
        + " e=" + e + " f=" + f + " term=" + term);
    return term;
  }
  
  public static void main(String[] args) {
    double x = 0.5;
    double s = 0;
    for (int i = 0; i <= 15; ++i ){
      s += calculateTerm (x, i);
    }
    System.out.println("Result=" + s);
  }

}
