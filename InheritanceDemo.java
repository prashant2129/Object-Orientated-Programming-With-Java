class BasicPhone { 
    String model; 
    int make; 

    void Basic() { 
        System.out.println("The Model is: " + model); 
        System.out.println("The Make Year is: " + make); 
    } 
} 

class Smartphone extends BasicPhone { 
    String biometric; 

    void Advance() { 
        Basic();
        System.out.println("Biometric Present: " + biometric); 
    } 
} 

public class InheritanceDemo { 
    public static void main(String[] args) { 
        Smartphone mySmartphone = new Smartphone(); 
        mySmartphone.model = "Samsung"; 
        mySmartphone.make = 2025; 
        mySmartphone.biometric = "Yes"; 
        mySmartphone.Advance(); 
    } 
}
