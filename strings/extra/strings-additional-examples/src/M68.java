import java.util.regex.Pattern;
import java.util.regex.Matcher;
class M68
{
	public static void main(String[] args) 
	{
		String src = "abc xyz hello";
		String exp = "^a";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}
