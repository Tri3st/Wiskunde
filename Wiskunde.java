import java.util.ArrayList;

/**
 * Een klasse met handige functies en betekeningen .
 * 
 * @author Martin van Diest
 */
public class Wiskunde {
  
  /**
   * Rekent n! uit. ofwel n faculteit
   * ofwel n * (n - 1) * .. * 2 * 1
   * per definitie geldt : 0! = 1 en
   * 1! = 1
   * alle n >= 0
   * @param n getal n (>= 0)
   * @return n!
   */
  public static long faculteit(long n) {
    if (n == 1) return 1;
    else return (n * faculteit(n - 1));
  }
  
  /**
   * geeft het n-e nummer in de fibonacci reeks terug.
   * fib(0) = 1 en fib(1) = 1
   * fib(2) = fib(1) + fib(0)
   * fib(n) = fib(n-1) + fib(n-2)
   * 
   * @param n getal n (>= 0)
   * @return n-e fibonacci getal
   */
  public static long fibonacci (long n) {
    if (n == 1 || n == 0) return 1;
    else {
      return fibonacci(n - 2) + fibonacci(n - 1);
    }
  }
  
  /*
   * hulpfunctie om te checken of een getal een priemgetal is.
   * priem -> als een getal deelbaar is door 1 en zichzelf.
   * true -> priem
   * false -> niet priem
   */
  private static boolean isPriem(long n) {
    boolean succes = false;
    int count = 0;
    if (n < 1) return succes;
    else if (n >= 1 && n <=3) return true;
    else {
      for (long i=2; i < n-1; i++){
        if (n % i == 0) count++;
      }
    }
    return (count == 0);
    
  }
  
  /**
   * functie delers geeft een array terug met daarin alle delers van n. (1 niet mergerekend)
   * @param n het getal waarvan de delers worden gezocht
   * @return array met alle delers van n.
   */
  public static int[] delers(int n){
    int index=0;
    int[] delers1 = new int[aantalDelers(n)];
    if (n == 1) delers1[0] = 1;
    else {
    for (int i = 2; i <= n; i++){
      if (n % i == 0) {
        delers1[index] = i;
        index = index + 1;
      }
    }
    }
    return delers1;
  }
  
  /*
   * hulp functie om het aantal delers van een getal te vinden.
   */
  private static int aantalDelers(int n){
    int count = 0;
    if (n == 1) return 1;
    else {
      for (int i=2; i <= n; i++){
        if (n % i == 0) count++;
      }
    }
    return count;
  }
  
  /**
   * functie bepaalt de Grootst Gemene Deler van twee getallen.
   * 
   * @param a getal 1
   * @param b getal 2
   * @return de ggd van a en b
   */
  public static int ggd(int a, int b){
    int grootste = 1;
    int[] aarr = delers(a);
    int[] barr = delers(b);
    if (aarr.length <= barr.length){
      for (int x:aarr){
        for (int y:barr){
          if (x == y && x>grootste)grootste = x;
        } 
      }
    } else {
      for (int x:barr){
        for (int y:aarr){
          if (x == y && x>grootste) grootste = x;
        }
      }
    } 
    return grootste;
  }
  
  
  /**
   *  Zoekt alle priemgetallen tot n. Zet deze in een arrayList. 
   *  
   * @param n tot welk getal moeten de priemgetallen worden gezocht.
   * @return array met de priemgetallen TOT n.
   */
  public static ArrayList<Integer> priemGetallen(int n) {
    ArrayList<Integer> lijst = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (isPriem(i)) lijst.add(i);
    }
    return lijst;
  }
  
}
