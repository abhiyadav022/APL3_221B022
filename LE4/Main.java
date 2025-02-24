public class Main{
public static void main(String [] args){
Singleton s1=Singleton.getInstance();
System.out.println(Singleton.x);
Singleton s2=Singleton.getInstance();
System.out.println(Singleton.x);
Singleton s3=new Singleton();

System.out.println(Singleton.x);

}
}