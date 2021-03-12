public class Polymorphism {
	public static void main(String[] args) {
		
		//instace of punjabi...
		indian maninder= new punjabi();
		
		//will call overridden speak method from class punjabi...
		maninder.speak();
		
		//instance of gujarati class...
		indian amit= new gujarati();
		//will call overridden speak method from class gujarati...
		amit.speak();
		
		//instance of class delhi...
		indian mukesh= new delhi();
		//will call method from class indian...
		mukesh.speak();
	}
}

//base class...
class indian {

    public void speak() {
        System.out.println("Speaks hindi");
    }

}

class punjabi extends indian {
    
	//speak function overriding...
    public void speak() {
    	System.out.println("Speaks punjabi");
    }

}

class gujarati extends indian {
    
	//speak function overriding...
    public void speak() {
    	System.out.println("Speaks gujarati");
    }

}

class delhi extends indian {
	
}
