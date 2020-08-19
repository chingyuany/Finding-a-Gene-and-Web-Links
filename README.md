# Finding-a-Gene-and-Web-Links  
This is the asssement from the Duke university online course: Java Programming: Solving Problems with Software.  
This program is to use different way to find a string of DNA in the strings. Also a program reads the lines from the file and print each URL on the page that is a link to youtube.com.  
1. Part1.java will do the following functions.    
Finds the index position of the start codon “ATG”. If there is no “ATG”, return the empty string.  
Finds the index position of the first stop codon “TAA” appearing after the “ATG” that was found. If there is no such “TAA”, return the empty string.  
If the length of the substring between the “ATG” and “TAA” is a multiple of 3, then return the substring that starts with that “ATG” and ends with that “TAA”.  

2. part2.java will determine if a DNA string has a gene in it by using the simplified algorithm.  
3. part3.java have new methods named twoOccurrences that has two String parameters named stringa and stringb. This method returns true if stringa appears at least twice in stringb, otherwise it returns false.  
otherone is named lastPart that has two String parameters named stringa and stringb. This method finds the first occurrence of stringa in stringb, and returns the part of stringb that follows stringa. If stringa does not occur in stringb, then return stringb.  

4. part4.java is to read youtube url from the file in different cases such as YouTube, youtube, or YOUTUBE.  