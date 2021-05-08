package wacWorkshop1;

import java.util.HashMap;
import java.util.HashSet;

public class ClassSix {

	public static void main(String[] args) {
//		HashSet<Character> set=new HashSet<Character>();
//		set.add('a');
//		set.add('b');
//		set.add('c');
//		set.add('d');
//		System.out.println(set);
//		System.out.println(set.size());
//		System.out.println(set.contains('a'));
//		System.out.println(set.isEmpty());
//		set.remove('a');
//		System.out.println(set.contains('a'));
//		String s="abca";
//		for(int i=0;i<s.length();i++) {
//			if(set.contains(s.charAt(i)))
//				System.out.println("Character already exists "+s.charAt(i));
//			set.add(s.charAt(i));
//		}
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		map.put('a', 3);
		map.put('b', 1);
		map.put('c', 1);
		map.put('d', 1);
		System.out.println(map);
		System.out.println(map.get('a'));
		map.remove('b');
		int value=map.get('c');
		map.put('c',value+1 );
		System.out.println(map);
	}

}
