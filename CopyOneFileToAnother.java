import java.io.*;
public class CopyOneFileToAnother {
 public static void main(String[] args) {
  try(FileReader r=new FileReader("source.txt"); FileWriter w=new FileWriter("backup.txt")){
   char[] b=new char[1024]; int n; while((n=r.read(b))!=-1) w.write(b,0,n);
   System.out.println("File copied successfully from source.txt to backup.txt.");
  }catch(IOException e){System.out.println("Copy failed. Check that source.txt exists and is readable.");}
 }
}
