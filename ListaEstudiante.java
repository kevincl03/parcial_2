import java.util.ArrayList;
import java.util.List;

public class ListaEstudiante {
   private static List<Estudiante> listaEstudiantes;

   public ListaEstudiante() {
      listaEstudiantes = new ArrayList<>();
      listaEstudiantes.add(new Estudiante("Juan", 20, 101L, 4.5));
      listaEstudiantes.add(new Estudiante("Maria", 22, 102L, 4.1));
      listaEstudiantes.add(new Estudiante("Carlos", 21, 103L, 3.8));
      listaEstudiantes.add(new Estudiante("Rosa", 23, 101L, 4.5));
      listaEstudiantes.add(new Estudiante("Luisa", 24, 102L, 4.1));
      listaEstudiantes.add(new Estudiante("Camila", 21, 103L, 3.8));
   }

   public List<Estudiante> getListaEstudiantes() {
      return listaEstudiantes;
   }
}
