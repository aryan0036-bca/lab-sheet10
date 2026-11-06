import java.io.*; import java.util.Scanner;
public class FileBasedEmployeeManagement {
 public static void main(String[] args) {
  File f=new File("employees.txt");
  try(Scanner sc=new Scanner(System.in)){
   try(FileWriter w=new FileWriter(f,true)){
    System.out.print("Enter Employee ID: "); String id=sc.nextLine().trim();
    System.out.print("Enter Employee Name: "); String name=sc.nextLine().trim();
    System.out.print("Enter Department: "); String dept=sc.nextLine().trim();
    System.out.print("Enter Salary: "); String salary=sc.nextLine().trim();
    w.write(id+"|"+name+"|"+dept+"|"+salary+System.lineSeparator());
   }
   System.out.print("Enter Employee ID to search: "); String target=sc.nextLine().trim(); boolean found=false;
   if(!f.exists()){System.out.println("Error: employees.txt does not exist.");return;}
   try(BufferedReader r=new BufferedReader(new FileReader(f))){String line;while((line=r.readLine())!=null){String[] a=line.split("\\|",-1);
    if(a.length==4&&a[0].equals(target)){System.out.println("Employee record found:");System.out.println("Employee ID: "+a[0]);System.out.println("Employee Name: "+a[1]);System.out.println("Department: "+a[2]);System.out.println("Salary: "+a[3]);found=true;break;}
   }}
   if(!found)System.out.println("Employee record not found.");
  }catch(IOException e){System.out.println("File error: "+e.getMessage());}
 }
}
