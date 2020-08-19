
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;
public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon)
    {
        char a = dna.charAt(0);
        String newdna = dna;
        
        if (Character.isUpperCase(a))
        {
            newdna = dna.toLowerCase();
        }
        
  
        int start = newdna.indexOf(startCodon);
		if (start == -1) {
			return "";
		}
		int stop = newdna.indexOf(stopCodon, start+3);
		if ((stop - start) % 3 == 0 && Character.isLowerCase(a) ) {
			return newdna.substring(start, stop+3);
		}
		else if ((stop - start) % 3 == 0 && Character.isUpperCase(a) ) {
			return (dna.substring(start, stop+3));
		}
		else {
			return "";
		}
    }
    
    public void testSimpleGene()
    {
        String startCodon = "atg";
        String stopCodon = "taa";
        String a1 = "AAATGCCCTAACTAGATTAAGAAACC";
        String result = findSimpleGene(a1,startCodon,stopCodon);
        String a2 = "atgtccaol";
        String result2 = findSimpleGene(a2,startCodon,stopCodon);
        String a3 = "atchadslal";
        String result3 = findSimpleGene(a3,startCodon,stopCodon);
        String a4 = "ocatgfghytataaghfdh";
        String result4 = findSimpleGene(a4,startCodon,stopCodon);
        String a5 = "OCATGFGATAGTAALDAD";
        String result5 = findSimpleGene(a5,startCodon,stopCodon);
        
        System.out.println("a1 Gene is " +result); 
        System.out.println("a2 Gene is " +result2); 
        System.out.println("a3 Gene is " +result3); 
        System.out.println("a4 Gene is " +result4); 
        System.out.println("a5 Gene is " +result5); 
    }
}
