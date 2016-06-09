import java.util.ArrayList;
import java.util.List;

class Student {
	private String fname;
	private String lname;
	private String fnumber;
	private String group;

	public Student(String fname, String lname, String fnumber, String group) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.fnumber = fnumber;
		this.group = group;
	}

	public Student() {
		this("", "", "", "");
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFnumber() {
		return fnumber;
	}

	public void setFnumber(String fnumber) {
		this.fnumber = fnumber;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", fnumber=" + fnumber + ", group=" + group + "]";
	}

}

public class Main {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		Student b1 = new Student("Peter", "Petrov", "1234", "5");
		Student b2 = new Student("Georgi", "Grigorov", "2345", "4");
		Student b3 = new Student("Martin", "Martinov", "4563", "7");
		Student b4 = new Student("Maria", "Marinova", "7856", "5");
		Student b5 = new Student("Lilia", "Yosifova", "4596", "3");
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		System.out.println(list.toString());
		Object [] a =  list.toArray();
		for (Object s : a)
			System.out.println(s);
	}
}
