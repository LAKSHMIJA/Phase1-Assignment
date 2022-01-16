package ProgramsAssignment;
public class AccessmodifiersPublic{
	public int id=86;
	public void study() {
		System.out.println("Studying java");
	}
	public static void main(String[]args) {
		AccessmodifiersPublic i=new AccessmodifiersPublic();
		System.out.println(i.id);
		i .study();
	}
}