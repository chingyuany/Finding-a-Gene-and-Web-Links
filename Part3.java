
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
    public boolean twoOccurrences(String stringa, String stringb)
    {
       int first = stringb.indexOf(stringa);
       if (first == -1)
       {
           return false;
        }
        int second = stringb.indexOf(stringa, first + stringa.length() );
        if (second == -1)
        { return false;}
        else
        {
            return true;
        }
    }
    public String lastPart(String stringa, String stringb)
    {
        int start = stringb.indexOf(stringa);
        if (start == -1)
        {
            return stringb;
        }
        else
        {
            return stringb.substring(start + stringa.length());
        }
    }
    
    public void testing()
    {
        String a1 ="a";
        String a2 ="oradkna";
        String b2 = "oraknq";
        String c2 = "iczcom";
        boolean result = twoOccurrences(a1,a2);
        boolean result2 = twoOccurrences(a1,b2);
        boolean result3 = twoOccurrences(a1,c2);
        String d1 = "an";
        String d2 = "banana";
        String e1 = "zoo";
        String e2 = "forest";
        String result4 = lastPart(d1,d2);
        String result5 = lastPart(e1,e2);
        System.out.println("a1 = " +a1 +" a2 = "+a2+ " result = "+result ); 
        System.out.println("a1 = " +a1 +" b2 = "+b2+ " result = "+result2 ); 
        System.out.println("a1 = " +a1 +" c2 = "+c2+ " result = "+result3 ); 
        System.out.println("The part of the string after "+d1+ " in " +d2+ " is " +result4 ); 
        System.out.println("The part of the string after "+e1+ " in " +e2+ " is " +result5 ); 
        
   
    
    }
}
