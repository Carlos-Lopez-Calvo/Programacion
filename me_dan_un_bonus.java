//Para hacer este cata simplemente he usado un if con el balor booleano que nos facilitan, si bonus es true creara una variable entera llamada doble que sera el salario x 10 y devolvera "£" y la variable doble,
//si es false solo devolvera "£" y la variable salary


public class Kata {
  public static String bonusTime(final int salary, final boolean bonus) {
    if (bonus) {
      int doble = salary * 10;
      return "£" + doble;
    } else {
      return "£" + salary;
    }
  }
}
