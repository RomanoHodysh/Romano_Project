public class Family {

    private int adults;
    private int children;
    private String surname;

    //constuctor
    public Family(String Surname){
        adults = 2;
        children = 0;
        surname = Surname;
    }

    //constuctor
    public Family(int adults, int children, String surname){
        this.adults = adults;
        this.children = children;
        this.surname = surname;
    }

    public void sayHi(){
        System.out.println("Hi we are " + surname);
        System.out.println("Our Family consists of: " + adults + " adults and " + children + " children");
    }

    public void addChild(){
        children = children + 1;
    }

    public String addNumber(){
        return "Our Family consists of: " + adults + " adults and " + children + " children";
    }
}