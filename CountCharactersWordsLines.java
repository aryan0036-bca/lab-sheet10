import java.io.*;
public class CountCharactersWordsLines {
 public static void main(String[] args) {
  int lines=0, words=0, chars=0;
  try {
   File f=new File("data.txt");
   if(!f.exists()) try(FileWriter w=new FileWriter(f)){w.write("Java is easy to learn.\nFile handling is useful.");}
   try(BufferedReader r=new BufferedReader(new FileReader(f))){String s; while((s=r.readLine())!=null){lines++; chars+=s.length(); if(!s.trim().isEmpty()) words+=s.trim().split("\\s+").length;}}
   System.out.println("Number of lines: "+lines);
   System.out.println("Number of words: "+words);
   System.out.println("Number of characters (excluding line breaks): "+chars);
  } catch(IOException e){System.out.println("File error: "+e.getMessage());}
 }
}
