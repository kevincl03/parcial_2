public class Main {
   public static void main(String[] args) {
      ListaEstudiante listaEstudiante = new ListaEstudiante();
      ListaCarrera listaCarrera = new ListaCarrera();
      System.out.println("Informacion de los Estudiantes:");
      for (Estudiante estudiante : listaEstudiante.getListaEstudiantes()) {
         System.out.println("\nNombre: " + estudiante.getNombre() + "\nEdad: " + estudiante.getEdad() + " Años" + "\nCodigo Carrera: "
               + estudiante.getCodigoCarrera() + "\nPromedio: " + estudiante.getPromedio());
      }
      listaCarrera.imprimirReporte();
   }
}
