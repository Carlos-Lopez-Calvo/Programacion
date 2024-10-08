//Esta es mi version del piedra papel tijera, lo he hecho usando variables de tipo String.
//Para poder jugar primero tendriamos que declarar que queremos que saque el jugador P1 y el P2, en este caso P1 sacara piedra y P2 sacara tijeras.
//A continuacion iran una serie de condicionales estos estan estructurados de la siguiente manera.
//Si(if) (P1 es igual(==) a piedra y(&&) P2 es igual(==) a papel) gana P2, y asi se repite con cada posibilidad del juego. 
//
public class MainClass {
  public static void main(String[] args) {
    
    String piedra = "piedra";
    String papel = "papel";
    String tijera = "tijera";
    String P1 = piedra;
    String P2 = papel;
    
    if (P1 == "piedra" && P2 == "papel") {
        System.out.println("P2 Gana!!");}
    else if (P1 == "piedra" && P2 == "tijera"){
        System.out.println("P1 Gana!!");}
    else if (P1 == "piedra" && P2 == "piedra"){
        System.out.println("Empate!!");}
    else if (P1 == "papel" && P2 == "piedra"){
        System.out.println("P1 Gana!!");}
    else if (P1 == "papel" && P2 == "tijera"){
        System.out.println("P2 Gana!!");}
    else if (P1 == "papel" && P2 == "papel"){
        System.out.println("Empate!!");}
    else if (P1 == "tijera" && P2 == "piedra"){
        System.out.println("P2 Gana!!");}
    else if (P1 == "tijera" && P2 == "papel"){
        System.out.println("P1 Gana!!");}
    else if (P1 == "tijera" && P2 == "tijera"){
        System.out.println("Empate!!");}
  }
}
