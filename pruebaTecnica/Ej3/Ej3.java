package pruebaTecnica.Ej3;

public class Ej3 {

    public static int leerHorasTrabajadas(){
        System.out.println("Introduce las horas trabajadas: ");
       return Integer.parseInt(System.console().readLine());
    }

    public static int leerTarifa(){
        System.out.println("Introduce la tarifa: ");
        return Integer.parseInt(System.console().readLine());
    }

    public static void main(String[] args){
        double resultado; 
        int horasTrabajadas = leerHorasTrabajadas();
        int tarifa = leerTarifa();
        if (horasTrabajadas <= 40){
            resultado = horasTrabajadas * tarifa;
        } else {
            resultado = (horasTrabajadas - 40) * (tarifa * 1.5) + (40 * tarifa);
        }

        System.out.println("El resultado es: " + resultado);

    }

    
}
