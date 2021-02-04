import java.util.Scanner;

public class Juego {
    
    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su nombre");
        jugador.setNombre(sc.nextLine());
        jugar(jugador,0);
    }

    public static void jugar(Jugador player, int s) {
       Dado dado1 = new Dado();
       Dado dado2 = new Dado();
       int d1=dado1.tirada();
       System.out.println("dado1:" +d1);
       int d2=dado2.tirada();
       System.out.println("dado2:" +d2);
       int suma=s+d1+d2;
       int opc;
       Scanner sn = new Scanner(System.in);
       Jugador p=player;
       int sta;
       System.out.println("la suma es:" +suma);
       sta= status(suma);
       if(sta==1){
           p.setStatus("ganador, premio mayor");
           System.out.println(p.toString());
           
       }
       if(sta==2){
        System.out.println("desea volver a jugar? 1.- si, 2.- no");
        opc= sn.nextInt();
        if(opc==1){
                     jugar(p,suma);
               }else{
                      sta=0;
               } 
       }

       if(sta==0){
        p.setStatus("perdedor\n"); 
        System.out.println(p.toString());
        System.out.println("juego terminado");
       }

   }

   public static int status(int sum) {
        int s=sum;
        int st=0;
        
        if(s==7 || s==11) {
            st=1;
             
        }
        if((s>3 && s<7) || (s>7 && s<11)){
            st=2;
        }

        if((s>1&&s<3) || s>=12){
               st=0;
        }

        return st;
    }
}
