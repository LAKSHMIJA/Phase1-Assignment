package ProgramsAssignment;
import java.util.Scanner;
public class SearchstringFromArrayOfString{

public static void main(String[] args)
{ 
// Initializing Array 	
String[] nameSearch = {"Reebok", "Nike"};


// Declaring Variables.
String newName;
int Results;

Scanner keyboard = new Scanner(System.in);

//Asking for input.
System.out.print("\nPlease enter in a name: ");
newName = keyboard.nextLine();

// Conditional statement.
Results = nameSearch(nameSearch, newName);

if (Results == -1)
{
System.out.print("\nFound the name " + newName );
}
else if(Results != -1)
{
System.out.print("\nCannot find specified name " + newName);
}

}
public static int nameSearch(String[] names, String name)
{
for (int n = 0; n < names.length; n++)
{
if (names[n].equals(name))
return n;
}

return -1;
}
}

