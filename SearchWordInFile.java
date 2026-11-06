import java.io.*; import java.util.*; import java.util.regex.*;
public class SearchWordInFile {
 public static void main(String[] args) {
  try {
   File f=new File("notes.txt"); if(!f.exists()) try(FileWriter w=new FileWriter(f)){w.write("Java is a programming language. Java supports file handling. Learning Java is useful.");}
   try(Scanner sc=new Scanner(System.in)){System.out.print("Enter word to search: "); String word=sc.nextLine().trim();
    if(word.isEmpty()){System.out.println("Please enter a valid word."); return;}
    Pattern p=Pattern.compile("\\b"+Pattern.quote(word)+"\\b",Pattern.CASE_INSENSITIVE); int count=0;
    try(BufferedReader r=new BufferedReader(new FileReader(f))){String line; while((line=r.readLine())!=null){Matcher m=p.matcher(line); while(m.find()) count++;}}
    if(count>0) System.out.println("Word found. Occurrences: "+count); else System.out.println("Word not found.");
   }
  }catch(IOException e){System.out.println("File error: "+e.getMessage());}
 }
}
