package calculator;

public class Calculator{

public static void main(String[] args)
{
	int a=12, b=12, c=24, d;
	if(b>=a && b>=c)
	{
		d=a;
		a=b;
		b=d;
	}
	else
		if(c>=a && c>=b)
		{
			d=a;
			a=c;
			c=d;
		}
	if(b*c==a)
	{
		System.out.println(b+"*"+c+"="+a);
		System.out.println(a+"/"+b+"="+c);
		System.out.println(a+"/"+c+"="+b);
	}
	if(b+c==a)
	{
		System.out.println(b+"+"+c+"="+a);
		System.out.println(a+"-"+b+"="+c);
		System.out.println(a+"-"+c+"="+b);
		
	}

}
}