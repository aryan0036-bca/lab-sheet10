import java.io.*;
public class CreateAndWriteFile {
 public static void main(String[] args) {
  File file = new File("student.txt");
  try (FileWriter w = new FileWriter(file)) {
   w.write("Student Name: Rahul Sharma\nRoll Number: 101\nCourse: BCA\nSemester: 1\n");
   System.out.println("File created and student data written successfully.");
   System.out.println("File location: " + file.getAbsolutePath());
  } catch(IOException e) { System.out.println("File error: " + e.getMessage()); }
 }
}
