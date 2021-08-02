// add your Class name
class TypeCasting  {;
// change according to if it is a test file or main file
    public static void main(String[] args){
        double d = 35.25;
        double dd = 35.99;
        float f = 99.99f;
        long l = 100000L;
        // short s = 55555555;
        char c = '1';

        //explicit casting bigger byte sizes into an int
        int i = (int) d;
        int i_f = (int) f; //need to do explicit casting for same size as well
        int long_int = (int) l;
        // int char_int = (int); 
        // implicit casting
        // int c_i = c; // ASCII table - 49
        int c_i = Character.getNumericValue(c);//to get numeric value from a char

        // casting double dd into an int
        int ii = (int) dd;
        // System.out.println(" casting double to int"+ i );
        // System.out.println(" casting double to int"+ ii);
        // System.out.println("float to int: " + i_f );//error: incompatible types: possible lossy conversion from double to float- attach f for floats and L for long
        // System.out.println("long to int: " + long_int );
        System.out.println(  c_i );
        // System.out.println(" char to int: " + long_int );

    }
}