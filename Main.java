public class Main{
  public static void main(String[] args) {
    
	//Hello World  
	for(int i=0;i<2;i++){
      System.out.println("Hello World"+i);
    }
    
	// Singleton Class  
	Singleton x = Singleton.getInstance();
	Singleton y = Singleton.getInstance();
	
	y.s = "Hello Vivek!";
	
	System.out.println(x.s);
	System.out.println(y.s);
	
	//Data Structures
	DataStructures d = new DataStructures();
	d.showArrayList();
	d.showLinkedList();
	d.showHashSet();
	d.showTreeSet();
	d.showHashMap();
	d.showTreeeMap();
	
  }
}
