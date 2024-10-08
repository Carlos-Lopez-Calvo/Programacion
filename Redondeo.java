//El Kata pide redondear a dos decimales, para ello usamos Math.round() y multipicamos por la potencia de 10 en este caso usaremos 100.0 y luego dividimos por la misma potencia de 10 en este caso 100.0
//
public class Numbers
{
  public static double TwoDecimalPlaces(double number)
  {
    double redondeo = Math.round(number * 100.0) / 100.0;
    
    return redondeo;
  }
}
