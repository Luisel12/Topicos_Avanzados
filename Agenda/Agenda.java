public class Agenda {
   private Persona personas[];
   private int cont;
   
   public Agenda(int cantidadPersonas) {
      personas = new Persona[cantidadPersonas];
      cont = 0;
   }
   
   public int getCont() {
      return cont;
   }
   
   public int getCelda(String n) {
      for (int x = 0; x < cont; x++) {
         if (personas[x].getNombre().equals(n)) {
            return x;
         }
      }
      return -1;
   }
   
   public void agregar(String n, String d, String t, String c) {
      Persona p = new Persona(n, d, t, c);
      personas[cont] = p;
      cont++;
   }
   
   public Persona getPersona(int c) {
      return personas[c];
   }
   
   public void modificar(Persona p, int c) {
      personas[c] = p;
   }
   
   public void eliminar(int c) {
      for (int x = c; x < cont -1; x++) {
         personas[x] = personas[x+1];
      }
      cont--;
   }
}