import java.io.*;
public class CountVowelsConsonantsDigitsSpaces {
 public static void main(String[] args) {
  int v=0,c=0,d=0,s=0;
  try {File f=new File("input.txt"); if(!f.exists()) try(FileWriter w=new FileWriter(f)){w.write("Java Lab 10");}
   try(FileReader r=new FileReader(f)){int x; while((x=r.read())!=-1){char ch=(char)x;
    if(Character.isLetter(ch)){if("AEIOUaeiou".indexOf(ch)>=0)v++;else c++;}
    else if(Character.isDigit(ch))d++; else if(ch==' ')s++;
   }}
   System.out.println("Vowels: "+v); System.out.println("Consonants: "+c); System.out.println("Digits: "+d); System.out.println("Spaces: "+s);
  }catch(IOException e){System.out.println("File error: "+e.getMessage());}
 }
}
