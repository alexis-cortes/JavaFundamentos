public class T2TiposPrimitivosObjeto {

    //Tipos de datos (Data types)

    int primitive = 5; // primitive data type
    boolean isPrimitive = true;

    Object obj = new Object(); // object data type
    String text = "ejemplo de un texto";

    //Primitivos:
    //boolean: true o false --> true
    //byte: Entero de 8 bits --> 39
    //short: Entero de 16 bits --> 780
    //int: Entero de 32 bits ---> 67480
    //long: Entero de 64 bits --> 500000
    //float: Decimal 32 bits --> 45.7f
    //double: Decimal 64 bits --> 80.4
    //char: unicode de 16 bits --> '@'

    //Los literales enteros se puden representar en:
    int decimal = 290;
    int octal = 0420;
    int Hexadecimal = 0xAF7;
    int binario = 0b100011;

    //Se puede usar el símbolo '_' para representar un literal númerico:
    int num = 2_345;
    double d = 55.5_4;

    //Errores de listera con simbolo '_'

    //int n= _436;
    //double d = 55._5;
    //long ln= 543_;

    //literales enteros son int
    //literales decimales son double
    //entonces se necesita para long (l) y para float(f) en la literal;

    long lg = 234l;
    //float f = 3.65; // error de compilación fin la letra f;
    float f = 3.65f;

    void metodo(){
        System.out.println(lg);
        System.out.println(f);
    }

    //Todos los primitivos son convertibles en otros, salvo boolean;
    //Conversiones Implícitas:
    int num2 = 55;
    double num3= num2;

    //Conversiones Explícitas (Utilizacion del Casting):
    double num4 = 5.4f;
    int num5=(int)num4;//casting
}
