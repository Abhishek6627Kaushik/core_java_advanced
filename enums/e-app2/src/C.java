import java.util.EnumSet;
enum B
{
	abc, xyz, test;
}
public class C
{
	public static void main(String[] args)
	{
		EnumSet<B> set = EnumSet.of(B.abc, B.xyz);
		//EnumSet is an abstract class
		for(B b1 : set)
		{
			System.out.println(b1);
		}
	}
}