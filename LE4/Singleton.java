public class Singleton{
public static int x=0;
	private static Singleton uniqueInstance;
	public Singleton(){
this.x++;
};
		public static Singleton getInstance(){
			if(uniqueInstance==null){
				uniqueInstance=new Singleton();
			}
			return uniqueInstance;
		}
}
