package lecture_1;

public class Method {

				public static void main(String[] args)
		{
					//class name variable name =new class neme();
		   
					
		   Method m1 =new Method();   // this formula is use for non static regular method for same class
		        
		   m1.a();
		   
		   m1.b();
					
		  OtherMethod m2 =new OtherMethod();   // this formula is use for non static regular method for different class
				
		        m2.c();
		        
				m2.d();

		}

				public void a()  //non static regular method declaraction
				{
						System.out.println("Good Morning ");
				}
		
		
				public void b()
				{
						System.out.println("have a nice day");
				}
}
