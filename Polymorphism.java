class A
{
	void show()
	{
        System.out.println("A Class");
	}
}
class B extends A
{
	void show()
	{
	    System.out.println("B Class");
	}
}
class C extends A
{
    void show()
    {
        System.out.println("C Class");
    }
}
class Polymorphism{
	public static void main(String args[])
	{
		A aa=new A();
		B bb=new B();
		C cc=new C();
        aa.show();
        bb.show();
        cc.show();
        A ref;
        ref=new B();
        ref.show();
        ref=new C();
        ref.show();
	}
}