import java.util.Scanner;

public void Loop{
  public static void main(String[] args)
  {
    int totalMarks, numberOfSub;
    float percentage;
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Enter the total number of subject");
    numberOfSub = s.nextInt();
    System.out.println("Enter the marks of each subject");
    for( int i=0;i<numberOfSub;i++)
    {
      totalMarks = totalMarks + s.nextInt();
    }
    
    System.out.println("Total Marks Obtained" + totalMarks);
    percentage = (totalMarks / (numberOfSub * 100)) *  100 ;
    
    if (percentage > 90)
      System.out.println("Grade is A+");
    else if (70 <= percentage && percentage <= 89) 
      System.out.println("Grade is A");
    else if (60 <= Percentage Marks <= 69) 
      System.out.println("Grade is B");
    else if (50 <= Percentage Marks <= 59) 
      System.out.prinltn("Grade is C");
    else 
      System.out.println("Grade is D");
  }
}
