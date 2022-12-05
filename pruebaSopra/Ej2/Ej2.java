package pruebaSopra.Ej2;
import pruebaSopra.Ej2.Persona;

public class Ej2 {
    Persona [] personas = new Persona[50];
    String[] sexo = {"Hombre", "Mujer"};

    public void leerPersonas(){
        int mayores18 = 0; 
        int hombresMayores18 = 0;
        int mujeresMenores18 = 0;
        int mujeres = 0; 
        for (int i = 0; i < 50; i++){
            int edad = (int) (Math.random() * 100);
            int sexo = (int) (Math.random() * 2);
            if(edad >= 18) {
                mayores18++;
            }
            if (sexo == 0 && edad >= 18){
                hombresMayores18++;
            }
            if (sexo == 1 && edad < 18){
                mujeresMenores18++;
            }
            if (sexo == 1){
                mujeres++;
            }
            personas[i] = new Persona(this.sexo[sexo], edad);
        }

        System.out.println("Hay " + mayores18 + " mayores de 18 años");
        System.out.println("Hay " + (50 - mayores18) + " menores de 18 años");
        System.out.println("Hay " + hombresMayores18 + " hombres mayores de 18 años");
        System.out.println("Hay " + mujeresMenores18 + " mujeres menores de 18 años");
        System.out.println("Hay un porcentaje de " + ((mayores18 * 100)/50) + "% de mayores de 18 años");
        System.out.println("Hay un porcentaje de " + ((mujeres * 100)/50) + "% de mujeres");
        
    }

    public static void main(String[] args) {
        Ej2 e = new Ej2();
        e.leerPersonas();

        



    }





    
}
