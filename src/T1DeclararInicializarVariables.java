public class T1DeclararInicializarVariables {
    //Declaracion e inicializacion de variables y su ámbito.

    int a=5; // declaración e inicilizacón de la variable y su ámbito es de tipo atributo.
    int b,c,d=10; //declaración múltiple.

    //Para declarar una variable (identificador) se pueden usar letras, números, '$' y '_'
    //No puede utilizar palabras reservadas, ejemplos: goto, break, new.
    //No puede comezar por carácter numérico.

    int _01 = 20; //ok
    // Ejemplos de Errores de declaraciones:
    //char new;
    //int 5xy;
    //float car.t

    void metodo(){
        int a; //Ámbito variable local, se puede ocupar el mismo nombre que en las de atributo.
        a = 10; //Acceso a variable local.
        this.a = 25; //Acceso a variable atributo.
    }


    //Variables locales: No se inicializan por defecto.
    //Variables atributo: Se inicializan por defecto.
    // int: 0, float: 0.0, boolean: false, char: '\u0000' (carácter nulo), objeto: null
    int x;
    int y;
    boolean status;
    void metodo2(){
        int y;
        x = x + 5; // no es necesario utilizar this, ya que no hay una variable local que se llame igual que la de atributo.
        y = this.y + 10;

        System.out.println(x);
        System.out.println(y);
        System.out.println(status);
    }

    //Existen dos tipos de variables de tipo PRIMITIVO y de tipo OBJETO;
    int n = 10; // primitivo: la variable contiene el dato.
    Object obj = new Object(); //objeto: la variable contiene una referencia al dato.


    //Primitivos: en una asignacion, cada variable tiene una copia del dato.
    int g = 5;
    int j = g; // j tiene su propio valor 5 hace una copia del valor de g.

    //Objeto: Ambas variables apuntan al mismo objeto.
    Object objRef1 = new Object();
    // objRef1 y objRef2 apuntan a la misma referencia no hace una copia, si se hace un cambio en objRef1 tambien se ve afectado objRef2.
    Object objRef2 = objRef1;
}
