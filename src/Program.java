public class Program
{
    public static void main(String[] args){
        Family hodysh = new Family("Hodysh");
//        hodysh.adults = 2;
//        hodysh.children = 2;
//        hodysh.surname = "Hodysh";
        hodysh.sayHi();

        Family hapko = new Family(2, 3,"Hapko");
//        hapko.adults = 2;
//        hapko.children = 3;
//        hapko.surname = "Hapko";
        hapko.sayHi();

        hodysh.addChild();
        hodysh.addChild();
        hodysh.sayHi();
        String a = hodysh.addNumber();
        System.out.println(a);
    }
}