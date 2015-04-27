import java.io.Console;

public class Ackermannfunction{
	public static long ackermannfunction(long x, long y){
		if(x==0){
			return y+1;
		}
		if(y==0){
			return ackermannfunction(x-1,1);
		}
		else{
			return ackermannfunction(x-1, ackermannfunction(x, y-1));
		}
	}
	public static void main(String[] args){
		Console c = System.console();
		String a = c.readLine("Please enter a value for x!");
		long x = Long.parseLong(a);
		String b = c.readLine("Please enter a value for y!");
		long y = Long.parseLong(b);
		System.out.println(ackermannfunction(x,y));
	}
}