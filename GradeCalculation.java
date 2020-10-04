import java.util.Scanner;
public class GradeCalclation
{
  public static void main(String[] args)
  {
        int marks[] = new int[5];
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(int i=0; i<6; i++) 
        { 
           System.out.print("Enter Marks of Subject marks"+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        
        avg = total/5;
        System.out.print("The Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
  }
}
