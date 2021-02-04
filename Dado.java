public class Dado {
    
    public int tirada(){
        System.out.println("Lanzando dado... ");
        int dado = (int)(Math.random() * 6) + 1;
        return dado;
    }
}
