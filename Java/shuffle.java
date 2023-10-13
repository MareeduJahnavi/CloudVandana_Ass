import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		ArrayList<Integer> l = new ArrayList<Integer>();

		for(int i : arr){
		    l.add(i);
		}
        
        Collections.shuffle(l);
        
        System.out.println(l);
	}
}
