class Demo {
	public static void main(String args[]){
	int a=10,b=20;
	a++;
	b++;
	System.out.println(a);
	System.out.println(b);
	a=a++ + ++a + b-- + --b;
	System.out.println(a);
	}
}