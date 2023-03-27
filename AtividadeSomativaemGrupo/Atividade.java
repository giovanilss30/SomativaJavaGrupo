package AtividadeSomativaemGrupo;

import java.util.Scanner;

public class Atividade {
    Scanner sc = new Scanner(System.in);
    public void atividade1() {
        System.out.println("Digite seu nome, sua idade, o sexo, a altura e o peso para descobrir o peso e as atividades ideais.");
        System.out.println("Digite seu nome: ");
        String nomeAluno = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idadeAluno = sc.nextInt();
        System.out.println("Digite seu sexo: \n 0 para masculino e 1 para feminino.");
        int sexoAluno = sc.nextInt();
        System.out.println("Digite sua altura: ");
        double alturaAluno = sc.nextDouble();
        System.out.println("Digite seu peso: ");
        double pesoAluno = sc.nextDouble();
        double pesoIdeal0=(72.7*alturaAluno)-58;
        double pesoIdeal1=(62.1*alturaAluno)-58;
        if(sexoAluno==0&&pesoAluno>pesoIdeal0){System.out.println("Você precisa perder "+(pesoIdeal0-pesoAluno)+"kg para chegar ao seu peso ideal.");}
        else if(sexoAluno==0&&pesoAluno<pesoIdeal0){System.out.println("Você precisa ganhar "+(pesoIdeal0-pesoAluno)+"kg para chegar ao seu peso ideal.");}
        else if(sexoAluno==1&&pesoAluno>pesoIdeal1){System.out.println("Você precisa perder "+(pesoIdeal1-pesoAluno)+"kg para chegar ao seu peso ideal.");}
        else if(sexoAluno==1&&pesoAluno<pesoIdeal1){System.out.println("Você precisa ganhar "+(pesoIdeal1-pesoAluno)+"kg para chegar ao seu peso ideal.");};
    }
}
