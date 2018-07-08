import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DataStructures{
	
	public void showArrayList() {
		// ArrayList
		System.out.println("------------Start of ArrayList");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		CollectionUtil.outputToConsole(al);

		System.out.println(al.get(1));
		System.out.println("--------------End of ArrayList");
	}
	
	public void showLinkedList() {
		//LinkedList
		System.out.println("---------------Start of LinkedList");
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("hello");
		ll.add("world");
		
		CollectionUtil.outputToConsole(ll);
		
		System.out.println(ll.get(1));
		System.out.println("-----------------End of LinkedList");
	}
	
	public void showHashMap() {
		//HashMap
		System.out.println("-----------------Start of HashMap");
		
		HashMap<Integer,String> hm = new HashMap();
		
		hm.put(1, "Vivek1");
		hm.put(2, "Vivek2");
		hm.put(2, "Vivek3");
		
		System.out.println(hm);
		
		
		System.out.println("-----------------End of HashMap");
	}
	
	public void showTreeeMap() {
		//TreeMap
		System.out.println("---------------Start of TreeMap");
		
		TreeMap<Integer,String> tm = new TreeMap();
			
		tm.put(2, "Vivek2");
		tm.put(1, "Vivek1");
		tm.put(3, "Vivek3");
		
		System.out.println(tm);
		System.out.println("-------------End of TreeMap");
				
	}
	
	public void showHashSet() {
		//HashSet
		System.out.println("-------------Start of HashSet");
		Set<String> hashset = new HashSet<String>();
		
		hashset.add("abc");
		hashset.add("hel");
		hashset.add("world");
		
		
		System.out.println(hashset);
		
		
		System.out.println("---------------End of HashSet");
	}
	
	public void showTreeSet() {
		//TreeSet
		System.out.println("---------------Start of TreeSet");
		Set<String> treeset = new TreeSet<String>();
			
		treeset.add("hel");
		treeset.add("zy");
		treeset.add("zy");
		treeset.add("abc");
		treeset.add("world");
			
			
		System.out.println(treeset);
		System.out.println("---------------End of TreeSet");
		
		
	}
	
	public void showSetOpeartions() {
		//Set Operations
		System.out.println("---------------Start of Set Operations");
		Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));
        
        System.out.println(a);
        System.out.println(b);
        
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);
        
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);
        
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
        System.out.println("---------------End of Set Operations");

	}
	
}