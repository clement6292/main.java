public class Exo1{
    public static void exo1(String[] args){
    byte aByte =0;
    short aShort =0;
    int anInt =0;
    long aLong =0;
    float aFloat =0;
    double aDouble =0;
    char aChar ='c';
    boolean aBoolean =false;


      System.out.println("byte par défaut : "+Byte.BYTES + aByte); // 0
        System.out.println("short par défaut : "+Short.BYTES + aShort); // 0
        System.out.println("int par défaut : "+Integer.BYTES+ anInt); // 0
        System.out.println("long par défaut : "+Long.BYTES + aLong); // 0L
        System.out.println("float par défaut : "+Float.BYTES + aFloat); // 0.0f
        System.out.println("double par défaut : "+Double.BYTES + aDouble); // 0.0d
    }
}