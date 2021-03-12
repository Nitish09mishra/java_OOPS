
public class Encapsulation {
	public static void main(String[] args) {
		
		//declaring object of Encaptest type...
		EncapTest encap = new EncapTest();  
		
		//calling setName method of Encaptest class...
        	encap.setName("Nitish Mishra");
        
        	//calling getName mathod of EncapTest class...
        	System.out.print("Hello : " + encap.getName());
	}
}

class EncapTest {

	//member variable...
    private String name;
    
    //getter method...
    public String getName() {
        return name;
    }

    //setter method...
    public void setName(String newName) {
        name = newName;
    }

}
