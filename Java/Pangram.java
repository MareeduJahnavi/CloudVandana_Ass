import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		HashSet<Character> set = new HashSet<Character>();  // set creation
		    
		for(int i=0; i<s.length(); i++){
		    char ch = s.charAt(i);
		    ch =Character.toLowerCase(ch);
		    if(ch==' '){
		        continue;
		    }
		    else{
		        set.add(ch);
		    }
		}
		
		if(set.size()==26){     // 26(number of Alphabets)
		    System.out.println("Pangram");
		}
		else{
		    System.out.println("Not a Pangram");
		}
	}
}
