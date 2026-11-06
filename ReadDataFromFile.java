import java.io.*;
public class ReadDataFromFile {
 public static void main(String[] args) {
  try (BufferedReader r = new BufferedReader(new FileReader("student.txt"))) {
   String line; System.out.println("Contents of student.txt:");
   while((line=r.readLine())!=null) System.out.println(line);
  } catch(IOException e) { System.out.println("Error: student.txt could not be read. Make sure it exists."); }
 }
}
