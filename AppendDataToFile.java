import java.io.*; import java.util.Scanner;
public class AppendDataToFile {
 public static void main(String[] args) {
  try(Scanner sc=new Scanner(System.in)){
   System.out.print("Enter student name: "); String name=sc.nextLine();
   System.out.print("Enter roll number: "); String roll=sc.nextLine();
   System.out.print("Enter marks: "); String marks=sc.nextLine();
   try(FileWriter w=new FileWriter("students.txt",true)){w.write("Name: "+name+", Roll Number: "+roll+", Marks: "+marks+System.lineSeparator());}
   System.out.println("Student record appended successfully.");
  }catch(IOException e){System.out.println("File error: "+e.getMessage());}
 }
}
