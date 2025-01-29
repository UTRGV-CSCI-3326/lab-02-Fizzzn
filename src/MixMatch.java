public class MixMatch{

    public static void main(String[] args){
        
        String words = "Hello!";
        char letter = 'L';
        short Snum = 123;
        int Inum = 456;
        long Lnum = 33; 
        float FNum = 45.56f;
        double Dnum = 3.55;
        boolean T_f = true;

        System.out.println(words + "<- String, A sequence of characters, stores text values like 'Hello World'.");
        System.out.println(letter + "<- Char, A single 16-bit Unicode character, stores one character, e.g., 'A'.");
        System.out.println(Snum + "<- short, A 16-bit signed integer, stores whole numbers from -32,768 to 32,767.");
        System.out.println(Inum + "<- int, A 32-bit signed integer, stores whole numbers from -2,147,483,648 to 2,147,483,647.");
        System.out.println(Lnum + "<- long, A 64-bit signed integer, stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.");
        System.out.println(FNum + "<- float, A 32-bit floating-point number, stores decimal values with 6-7 digits of precision.");
        System.out.println(Dnum + "<- double, A 64-bit floating-point number, stores decimal values with 15-16 digits of precision.");
        System.out.println(T_f + "<-  boolean, A logical data type, stores either true or false.");
    }


}