

/* Implement an algorithm to determine if a string has all unique characters. What if
you cannot use additional data structures?
*/


package string_uniquechar;

public class String_UniqueChar {
    
    public boolean isUniqueChar(String str){
        
        if(str.length()>256){   // Assuming ASCII char string
            return false;
        
        }
        else {
            
            boolean [] bol_array = new boolean[256];
        
            for (int i=0;i<str.length();i++){
                int val = str.charAt(i);
                    if (bol_array[val]){   // If the variable in the boolean array had been set true alareay return false
                        return false;
                    }
            else{
                bol_array[val] = true;
                }
                
             }
        }
        return true;
        
    }

    public static void main(String[] args) {
    
        String str = "The quick brown fox jumps over a lazy dog";
        String_UniqueChar obj = new String_UniqueChar();
        boolean check = obj.isUniqueChar(str);
        System.out.println(" String has unique characteres :- " +check);
                
    }
    
}
