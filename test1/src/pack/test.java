package pack;
@FunctionalInterface
interface Add
{
public int getadd(int a,int b);	
}
interface display
{
	public String show();
}
public class test {
	public static void main(String[] args) {
		Add a1=(a,b)-> a+b;
		System.out.println(a1.getadd(6,6));
		display d=()-> "Lamda without";
		System.out.println(d.show());
		
	}

}

