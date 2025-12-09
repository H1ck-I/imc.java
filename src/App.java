import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("digite sua altura: ");
    var altura =sc.nextDouble();
    System.out.print("digite seu peso: ");
    var peso =sc.nextDouble();

    var imc = peso/(altura*altura);

    var categoria = "";

    if(imc <=18.5){
        categoria = "abaixo";
    }
    else if (imc<=24.9){
        categoria = "ideal";
    }
    else if (imc<=29.9){
        categoria = "acima";
    }
    else if (imc <= 34.9){
        categoria = "grau1";
    }
    else if (imc <= 39.9){
        categoria = "grau2";
    }
    else {
        categoria = "grau3";
    }

    switch(categoria){
        case "abaixo":
            System.out.println("Abaixo do peso");
            break;
        case "ideal":
            System.out.println("Peso ideal");
            break;
        case "acima":
            System.out.println("Levemente acima do peso");
            break;
        case "grau1":
            System.out.println("Obesidade grau I");
            break;
        case "grau2":
            System.out.println("Obesidade grau II(Severa)");
            break;
         case "grau3":
            System.out.println("Obesidade grau III(Mórbida)");
            break;
    }
sc.close();
}
}