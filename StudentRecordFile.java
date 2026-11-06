import java.io.*; import java.util.Scanner;
public class StudentRecordFile {
 public static void main(String[] args) {
  try(Scanner sc=new Scanner(System.in)){
   try(FileWriter w=new FileWriter("student_records.txt")){for(int i=1;i<=5;i++){
    System.out.println("\nEnter details for student "+i); System.out.print("Roll Number: "); String roll=sc.nextLine();
    System.out.print("Name: "); String name=sc.nextLine(); System.out.print("Course: "); String course=sc.nextLine();
    System.out.print("Marks: "); String marks=sc.nextLine();
    w.write("Roll Number: "+roll+", Name: "+name+", Course: "+course+", Marks: "+marks+System.lineSeparator());
   }}
   System.out.println("\nAll five student records saved. Records are:");
   try(BufferedReader r=new BufferedReader(new FileReader("student_records.txt"))){String line;while((line=r.readLine())!=null)System.out.println(line);}
  }catch(IOException e){System.out.println("File error: "+e.getMessage());}
 }
}
