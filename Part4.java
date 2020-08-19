
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;
import java.io.*;
public class Part4 {
  public void url()
  {
    URLResource ur = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
    for (String word : ur.words()) {
       String newword = word.toLowerCase();
    int youtube = newword.indexOf("youtube.com");
    if (youtube !=-1)
    {
        
        int start = word.indexOf("\"");
        int stop = word.lastIndexOf("\"");
        System.out.println(word.substring(start,stop+1));
        /*if (start != -1)
        {
            int stop = word.indexOf("\"",start+1);
            System.out.println(word.substring(start,stop+1));
        }
        */
    
}
}
  
}
}
