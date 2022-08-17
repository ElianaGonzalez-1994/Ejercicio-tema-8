public class Main {
    public static void main(String[] args) {
        Persona edad = new Persona();

        edad.setTipo("25");

        Persona nombre = new Persona();

        nombre.setTipo("Eliana");

        Persona telefono = new Persona();

        telefono.setTipo("1168540345");

        System.out.println(edad.getTipo());
        System.out.println(nombre.getTipo());
        System.out.println(telefono.getTipo());


    }
}

class Persona {
   private String tipo;


   public void setTipo(String tipo) {
       this.tipo = tipo;
   }
      public String getTipo() {
          return this.tipo;
       }
           }




  