/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main 
{
    private String name;
    private int speed;
	public void setname(String name)
	{
	    this.name=name;
	}
	public void setspeed(int  speed)
	{
	    this.speed=speed;
	}
	public String getname()
	{
	    return this.name;
	}
	public int getspeed()
	{
	    return this.speed;
	}
    
	public static void main(String[] args)
    {
        Main car=new Main();
        car.setname("Dzire");
        car.setspeed(100);
        System.out.println(car.getname()+" "+car.getspeed()+"km/h");
	}
}
