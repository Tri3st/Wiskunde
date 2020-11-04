import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    /*
    String s1 = new String("gelijk");
    String s2 = "gelijk";
    String s3 = "gelijk";
    String s4 = s1;
    System.out.println(s1 == s4);
    System.out.println(s3 == s2);
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
    */
    
    
    for  (int i = 1; i < 21; i++){
      //System.out.println(i + " fac " + faculteit(i));
      //System.out.println(i + " fibb " + fibonacci(i));
      int[] temp = Wiskunde.delers(i);
      System.out.print( i + "delers : ");
      for (int j=0; j<temp.length;j++){
     System.out.print(temp[j] +(j==temp.length-1?".":", "));
      }
      System.out.println("");
    }
    Scanner sc = new Scanner(System.in);
    System.out.println("Geef getal 1 :");
    int n1 = sc.nextInt();
    System.out.println("Geef getal 2 :");
    int n2 = sc.nextInt();
    System.out.printf("ggd van %d en %d is : %d%n", n1, n2,Wiskunde.ggd(n1, n2));
    
  }
  
}