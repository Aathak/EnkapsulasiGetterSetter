package person_modifier;

public class Person_Modifier {

    public static void main(String[] args) {
        Person usn = new Person();
        
        usn.setUsername("Otak");
        usn.setPassword("*******");
        
        System.out.println("Username: " + usn.getUsername());
        System.out.println("Password: " + usn.getPassword());
    }
    
}
