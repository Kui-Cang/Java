
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			int num = 12, den = 0;
			int ans = num / den;
			System.out.println("ans=" + ans);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("���Ƭ� 0");
		} 
		finally 
		{
			System.out.println("end of main() method!!");
		}
	}
}
