import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Fila { //Queue
    public static void main(String[] args) throws Exception {
        //LinkedList<Usuario> Fila = new LinkedList<Usuario>();
        //Queue<Usuario> fila = new ArrayDeque<Usuario>();
        Queue<Usuario> fila = new LinkedList<Usuario>();

        Usuario u1 = new Usuario("Usuario1");   
        Usuario u2 = new Usuario("Usuario2");   
        Usuario u3 = new Usuario("Usuario3");   
        Usuario u4 = new Usuario("Usuario4");   

        fila.add(u1);
        fila.offer(u2);
        fila.add(u3);
        fila.add(u4);

        fila.poll(); // Remove o primeiro

        fila.remove(u4);
        

        System.out.println(fila.peek().getNome());
        System.out.println(fila.element());

        System.out.println(fila.isEmpty());
        System.out.println(fila.size());
        System.out.println(fila.contains(u1));
        
        for (Usuario usuario : fila) {
            System.out.println(usuario.getNome());
        }
    }
}
