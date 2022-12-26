class Parent
{
	public void cry()
	{
       System.out.println("parent does not cry");
       
	}
	
	
}  

class Child1 extends Parent
{
	public void cry()
	{
       System.out.println("child1  cries at lower  voice");
       
	}
	
	
}  


class Child2 extends Parent
{
	public void cry()
	{
       System.out.println("child2  cries at medium  voice");
       
	}
	
	
}  

class Child3 extends Parent
{
	public void cry()
	{
       System.out.println("child3  cries at loud voice");
       
	}
	
	
}  

 class Launch1 {

	public static void main(String[] args) {
	
		

        Parent ref;
        Child1 c1 = new Child1 ();
        ref=c1;
        ref.cry();
        Child2 c2 = new Child2 ();
        ref=c2;
        ref.cry();
        Child3   c3 = new Child3  ();
        ref=c3;
        ref.cry();
	    }
     } 

	
	
	
	
	

	

