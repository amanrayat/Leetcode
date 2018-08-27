import java.util.HashMap;
import java.util.Map;

public class Anagram {

	static boolean isAnagram(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<a.length();i++){
			if(!map.containsKey(a.charAt(i))){
				map.put(a.charAt(i),1);
			}
			else{
				Integer freq = map.get(a.charAt(i));
				map.put(a.charAt(i) , ++freq);
			}
		}
		for(int i=0;i<b.length();i++) {
			if(!map.containsKey(b.charAt(i))){
				return false;
			}
			else {
				Integer freq = map.get(b.charAt(i));
				if(freq == 0 ){
					return false;
				}
				else{
					map.put(b.charAt(i) , --freq);
				}
			}

			// Complete the function
		}
		return true;

	}
	public static void main(String[] args) {

		String a = "Aman";
		String b = "aman";
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}
