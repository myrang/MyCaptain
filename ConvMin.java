import java.util.Scanner;
public class ConvMin{
  public static void main(String[] args)
  {
      double mintesInYear = 60 * 24 * 365;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the minute");
      double min = s.nextDouble();
      
      long years = (long) ( min / mintesInYear );
      int days = (int) ( min / 60 / 24 ) % 365;
      
      System.out.println(years + " years " + days + " days");
  }
}
