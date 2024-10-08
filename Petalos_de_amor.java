//Este es mi resultado del problema//


// Primero definimos una clase llamada sid, esto esta proporcionado por el ejercicio de code wars//
public class Sid { 
// A continuacion definimos metodo String llamado howMuchILoveYou(int nb_petals) este metodo cogera numeros enteros de la variable nb_petals y las convertira en String
tambien esta proporcionado por code wars//
    public static String howMuchILoveYou(int nb_petals) {
// Ahora haremos un String array llamado petalos donde gardaremos las diferentes frases.//
        String[] petalos = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
// Y a la hora de debolver el dato usaremos retrun, ponemos la variable array que hemos creado y le decimos que coga un numero de la variable nb_petals que llega hasta 6
ya que es el numero de frases que hay en el Array.
        return petalos[nb_petals % 6];
// para que funcione en codewars: return petalos[(nb_petals - 1) % 6] //
    }
}
