import java.util.Scanner;

class Automovel{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		Automovel_caracteristicas Automovel1;
		Automovel1  = new Automovel_caracteristicas(); 
       
        float distancia;
		
	    System.out.println("digite a marca do automovel:");
        Automovel1.marca = sc.next();
        System.out.println("digite o modelo do automovel:");
        Automovel1.modelo = sc.next();
        System.out.println("digite o tipo de chassi:");
        Automovel1.chassi = sc.next();
        System.out.println("digite a distancia percorrida:");
        distancia = sc.nextFloat();
        System.out.println("digite a capacidade do tanque do automovel");
        Automovel1.tanque_capacidade = sc.nextFloat();
        System.out.println("digite o quanto ele consome por km");
        Automovel1.consumo = sc.nextFloat();


        Automovel1.percorre(distancia);

        System.out.println("marca:"  +  Automovel1.marca);
        System.out.println("modelo:" +  Automovel1.modelo);
        System.out.println("chassi:" +  Automovel1.chassi);
        System.out.println("tanque antes da partida:" + Automovel1.tanque_capacidade);
        System.out.println("tanque depois da partida:"+ Automovel1.percorre(distancia));




	}
}