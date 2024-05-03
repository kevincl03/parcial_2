public class Estudiante {
   private String nombre;
   private int edad;
   private Long codigoCarrera;
   private double promedio;

   public Estudiante() {

   }

   public Estudiante(String nombre, int edad, Long codigoCarrera, double promedio) {
      this.nombre = nombre;
      this.edad = edad;
      this.codigoCarrera = codigoCarrera;
      this.promedio = promedio;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getEdad() {
      return edad;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }

   public Long getCodigoCarrera() {
      return codigoCarrera;
   }

   public void setCodigoCarrera(Long codigoCarrera) {
      this.codigoCarrera = codigoCarrera;
   }

   public double getPromedio() {
      return promedio;
   }

   public void setPromedio(double promedio) {
      this.promedio = promedio;
   }
}