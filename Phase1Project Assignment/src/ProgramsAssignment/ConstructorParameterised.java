package ProgramsAssignment;
class Std{
	int id;
	String name;

Std(int i,String n)
	{	id=i;
name=n;
	}
void display() {
System.out.println(id+" "+name);
	}
}


public class ConstructorParameterised {

public static void main(String[] args) {
Std std1=new Std(15,"LAKSHMITV");
Std std2=new Std(50,"SAIKUMAR");
std1.display();
std2.display();
			}
	}






