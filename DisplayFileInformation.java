import java.io.File; import java.util.Scanner;
public class DisplayFileInformation {
 public static void main(String[] args) {
  try(Scanner sc=new Scanner(System.in)){System.out.print("Enter file or directory name: "); File f=new File(sc.nextLine());
   System.out.println("Exists: "+f.exists()); System.out.println("File name: "+f.getName());
   System.out.println("Absolute path: "+f.getAbsolutePath());
   System.out.println("File size: "+(f.exists()&&f.isFile()?f.length()+" bytes":"Not a regular file"));
   System.out.println("Is file: "+f.isFile()); System.out.println("Is directory: "+f.isDirectory());
   System.out.println("Readable: "+f.canRead()); System.out.println("Writable: "+f.canWrite());
  }
 }
}
