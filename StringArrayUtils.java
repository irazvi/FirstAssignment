 import java.util.Stack;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        if(array.length >= 1){
            return array[0];
        }
        return null;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
          if(array.length >= 2){
            return array[1];
        }
        
        
        return null;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        if(array.length >= 1){
            return array[array.length-1];
        }
        
        return null;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        if(array.length >= 2){
            return array[array.length-2];
        }
        
        return null;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        
        for(String st: array) {
            if(st.equals(value)) {
                    return st.equals(value);
                }
            }       
        
        
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        if(array.length == 0) return null;
        int len = array.length-1;
        String[] output = new String[len+1];
        int j = 0;
        for(int i = len;i>=0;i--){
            output[j++] = array[i]; 
        }
        
        
        return output;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
       int len = array.length;
        if(array.length == 0) return false;
        if(array.length % 2 == 1) {
        	for(int i = 0;i<len;i++){
                if(array[i] != array[len-i-1]){
                    return false;
                 }
             
         }
        }else {
        	for(int i = 0;i<len/2;i++){
           if(array[i] != array[len-i-1]){
               return false;
            }
        
    }
        }
       
       
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        
		int[] alp = new int[26];
		for(String s: array) {
			int n = s.length();
			for(int i =0;i<n;i++) {
				if(s.toLowerCase().charAt(i) != ' ') {
					alp[s.toLowerCase().charAt(i)-'a']++;
				}
				
			}
		}
		for(int i = 0;i<alp.length;i++) {
			System.out.println(alp[i]);
		}
		for(int i = 0;i<alp.length;i++) {
			if(alp[i] == 0)return false;
		}
		
        return true;
            }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
 
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        
        for(int i = 0;i<array.length;i++){
            if(array[i].equals(value)) count++;
        }
        
        
        
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int count = 0;
        for(int i = 0;i<array.length;i++) {
        	if(array[i].equals(valueToRemove)) {
        		count++;
        	}
        }
        
        String[] output = new String[array.length-count];
        int j = 0;
        for(int i = 0;i<array.length;i++) {
        	if(!array[i].equals(valueToRemove)) {
        		output[j++] = array[i];
        	}
        }
        return output;
    }
   
    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO'
    
    public static String[] removeConsecutiveDuplicates(String[] array) {
           int n = array.length; 
	
	        if (n < 2)  
	        { 
	            return array; 
	        } 
	  
	        int j = 0; 
	   
	        for (int i = 1; i < n; i++)  
	        { 
	            // If current character S[i] 
	            // is different from S[j] 
	            if (array[j] != array[i]) 
	            { 
	                j++; 
	                array[j] = array[i]; 
	            } 
	        } 
	        String[] output = Arrays.copyOfRange(array, 0, j +1);
	        return output; 

	  
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
         Stack<String> stack = new Stack<>();
	       List<String> list = new LinkedList<>();
	       for(int i = array.length-1;i>=0;i--) {
	    	  stack.push(array[i]);
	       }
	       
	       while(!stack.isEmpty()) {
	    	   StringBuilder sb = new StringBuilder("");
	    	   sb.append(stack.pop());
	    	   while(!stack.isEmpty()&&sb.charAt(sb.length()-1) == stack.peek().charAt(0)) {
	    		   
	    		   sb.append(stack.pop());
	    	   }
	    	 list.add(sb.toString());
	       }
	       String[] arr = new String[list.size()]; 
	        arr = list.toArray(arr); 
	        
	        for(String s: arr) {
	        	System.out.println(s);
	        }
	       return arr;
	
    }


}
