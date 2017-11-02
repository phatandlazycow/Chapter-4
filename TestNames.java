public class TestNames{
    public static void main(String[] args){
        Name josh = new Name("josh","vermin","klipper");
        Name freddy = new Name("freddy", "Johannesburg","Krueger");
        System.out.println(josh.firstMiddleLast());
        System.out.println(josh.lastFirstMiddle());
        System.out.println(josh.initials());
        System.out.println(josh.length());
        System.out.println(freddy.firstMiddleLast());
        System.out.println(freddy.lastFirstMiddle());
        System.out.println(freddy.initials());
        System.out.println(freddy.length());
        System.out.println(josh.equals(freddy));
    }
}