public class Abstraction {

    public static void main(String[] args) {
        
        Phone latestVersion = new PhoneSet2();
        latestVersion.call();
        latestVersion.camera();
        latestVersion.musicPlayer();
        latestVersion.videoGame();
    
    }

}

abstract class Phone {

    public void call() {
        System.out.println("Calling...");
    }
    
    //abstract classes...
    public abstract void camera();
    public abstract void musicPlayer();
    public abstract void videoGame();
}

//extended version of class Phone, also inherits from phone...
abstract class PhoneSet1 extends Phone{

	//implemented new feature of camera...
    public void camera(){
        System.out.println("\nCamera...");
    }
  
}

//extended version of class PhoneSet1, it inherits from PhoneSet1...
//this class has some more features than PhoneSet1...
//this class has all the features of class Phone and PhoneSet1....
class PhoneSet2 extends PhoneSet1 {
	
	//implemented new feature of musicPlayer...
    public void musicPlayer(){
        System.out.println("\nMusic...");
    }
    
    //implemented new feature of videoGaming...
    public void videoGame(){
        System.out.print("\nVideogame...");
    }
}