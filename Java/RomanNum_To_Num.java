import java.util.*;

public class Main{
    
    //to get the value of individual character for input string
    public static int value(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
    
    //converting romanNm to Interger
    public static int RomanToInt(String s){
        if(s==null || s.length()==0){
            return 0;
        }
        
        int res =0;
        for(int i=0; i<s.length(); i++){    //to parse the string
            
            //calculating the romanNUmber
            int charValue = value(s.charAt(i));      //calling the method to get value for a char
            
            if (i+1 < s.length()) {
                
                int charValue1 = value(s.charAt(i+1));
                
                if(charValue >= charValue1){
                    res+=charValue;
                }
                else{
                    res-=charValue;
                }
            }
            else{
                res+=charValue;
            }
        }
        return res;
    }
    
    //main method
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String input = sc.next();           //input reading
		
		int output = RomanToInt(input);     //calling the method and assign the result to a variable(output)
		System.out.println(output);         //output printing
	}
}