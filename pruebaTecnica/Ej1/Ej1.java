package pruebaTecnica.Ej1;

public class Ej1 {

  public static int leerNumero() {
    System.out.println("Introduce un número: ");
    return Integer.parseInt(System.console().readLine());
  }
  
    public static void main(String[] args) {
      int numero = leerNumero();
      boolean par; 
      if (numero % 2 == 0) {
        par = true;
      } else {
        par = false;
      }

      while (numero >= 0){
        System.out.println(numero);
        if (par){
          numero = numero - 2;
        } else {
          numero = numero - 2; 
        }

      }


    }
  }
  