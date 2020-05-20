
public class Test {

	public static void main(String[] args) {
		Person p = new Person("Sagar", "Irving");
		System.out.println(p);
		
		Student s = new Student("Suman", "Garnd Parie", "Bachlor", 2020, 2020.20);
		System.out.println(s);
		
		Staff sf=new  Staff("Suraj", "Arlington", "Texa A&M", 2021);
		System.out.println(sf);
		
		Person st = new Student("suman", "irving", "B.Ed", 2018, 1010.22);
		System.out.println(st);
		
		st.setAddress("Colorado");
		System.out.println("The address of studnet st is: "+st.getAdress());
		

	}

}
