public class Hello{
  public static void main(String[] args) {
    /*for(int i=0;i<10;i++){
      System.out.println("Hello World"+i);
    }
    System.out.println("Sending Email Notification");*/
	  
	Singleton x = Singleton.getInstance();
	Singleton y = Singleton.getInstance();
	
	y.s = "Hello Vivek!";
	
	System.out.println(x.s);
	System.out.println(y.s);
	
  }
}
