package ProgramsAssignment;

public class InnerClass {

		private String msg="Welcome to Java"; 
		 
		 class Inner{  
		  void hello(){
			  System.out.println(msg+", welcome to InnerClasses");}  
		 }  


		public static void main(String[] args) {
			InnerClass obj=new InnerClass();
			InnerClass.Inner in=obj.new Inner();  
			in.hello();  
		}
	
	
	}


