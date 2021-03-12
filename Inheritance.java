
public class Inheritance {
	public static void main(String[] args) {
        
		// creating new instance of class human...
       		student aman= new student();
        
        	//this will call the speak method present in human class because of inheritance...
        	aman.speak(); 
        	//will call study method from student class....
        	aman.study();
	}
}

//base class...
class human {

    public void speak() {
        System.out.println("Human Speaking");
    }

}

//child class of human..which inherits data and functions of class human...
class student extends human {

    public void study() {
    	System.out.println("Student Studies");
    }

}
