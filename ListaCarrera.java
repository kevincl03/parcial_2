import java.util.ArrayList;
import java.util.List;

public class ListaCarrera {
   List<Carrera> carreras;
   List<ReportePromedioCarrera> reportes;

   public ListaCarrera() {
      carreras = new ArrayList<>();
      carreras.add(new Carrera(101L, "Ingeniería de Sistemas"));
      carreras.add(new Carrera(102L, "Ingeniería Industrial"));
      carreras.add(new Carrera(103L, "Matemáticas"));

      calcularReportes();
   }

   public void calcularReportes() {
      reportes = new ArrayList<>();
      for (Carrera carrera : carreras) {
         ReportePromedioCarrera reporte = new ReportePromedioCarrera(carrera);
         double sumaNotas = 0;
         double sumaEdades = 0;
         int cantidadEstudiantes = 0;
         for (Estudiante estudiante : new ListaEstudiante().getListaEstudiantes()) {
            if (estudiante.getCodigoCarrera().equals(carrera.getCodigo())) {
               sumaNotas += estudiante.getPromedio();
               sumaEdades += estudiante.getEdad();
               cantidadEstudiantes++;
            }
         }
         if (cantidadEstudiantes != 0) {
            reporte.promedioNotas = sumaNotas / cantidadEstudiantes;
            reporte.promedioEdad = sumaEdades / cantidadEstudiantes;
         }
         reportes.add(reporte);
      }
   }

   public void imprimirReporte() {
      System.out.println("Reportes de Carreras:");
      for (ReportePromedioCarrera reporte : reportes) {
         System.out.println("\nCarrera: " + reporte.carrera.getNombre());
         System.out.println("Promedio de notas: " + reporte.promedioNotas);
         System.out.println("Promedio de edad de estudiantes: " + reporte.promedioEdad);
      }
   }
}
