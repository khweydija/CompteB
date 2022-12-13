import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


      //  System.out.println("choisir A pour affiche ou C pour  creditercompte ou  D pour debitercompte ou V pur virerSolde");
       // Scanner sc = new Scanner(System.in);
      //  String op = sc.nextLine();
     //   switch (op){
       //     case"A":                break;
        //    case"C":          break;
        //    case"D ":            break;
        //    case"V":                break;
        //}


        Compte c1 = new Compte("Ahmed",1000);
        Compte c2 = new Compte("fati",5000,6000,5000);



        c1.affiche();
        c2.affiche();

       // c2.virerSolde(c1,300);
       // c1.affiche();
       // c2.affiche();





    }
}