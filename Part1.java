
public class Part1 {
    public String findSimpleGene(String dna)
    {
        int start = dna.indexOf("atg");
		if (start == -1) {
			return "";
		}
		int stop = dna.indexOf("taa", start+3);
		if ((stop - start) % 3 == 0) {
			return dna.substring(start, stop+3);
		}
		else {
			return "";
		}
    }
    
    public void testSimpleGene()
    {
        String a1 = "atchadsltaal";
        String result = findSimpleGene(a1);
        String a2 = "atgtccaol";
        String result2 = findSimpleGene(a2);
        String a3 = "atchadslal";
        String result3 = findSimpleGene(a3);
        String a4 = "ocatgfghytataaghfdh";
        String result4 = findSimpleGene(a4);
        String a5 = "jkhgatgdatdutaagdfh";
        String result5 = findSimpleGene(a5);
        
        System.out.println("a1 Gene is " +result); 
        System.out.println("a2 Gene is " +result2); 
        System.out.println("a3 Gene is " +result3); 
        System.out.println("a4 Gene is " +result4); 
        System.out.println("a5 Gene is " +result5); 
    }
}
