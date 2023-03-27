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
        double imcAluno = pesoAluno/(alturaAluno*alturaAluno);
        System.out.println("");
        System.out.println("Ficha do aluno:");
        System.out.println("");
        System.out.println("Nome: "+nomeAluno);
        System.out.println("Idade: "+idadeAluno);
        if (sexoAluno==0){System.out.println("Sexo: Masculino");}
        else {System.out.println("Sexo: Feminino");};
        System.out.println("");
        System.out.println("Altura: "+alturaAluno+"m.");
        System.out.println("Peso: "+pesoAluno+"kg.");
        System.out.println("");
        System.out.println("O seu IMC é de "+imcAluno);
        if(sexoAluno==0){System.out.printf("Seu peso ideal é "+pesoIdeal0+"kg.");}
        else{System.out.printf("Seu peso ideal é "+pesoIdeal1+"kg.");};
        if(sexoAluno==0&&pesoAluno>pesoIdeal0){System.out.println("Você precisa perder "+(pesoAluno-pesoIdeal0)+"kg para chegar ao seu peso ideal.");}
        else if(sexoAluno==0&&pesoAluno<pesoIdeal0){System.out.println("Você precisa ganhar "+(pesoIdeal0-pesoAluno)+"kg para chegar ao seu peso ideal.");}
        else if(sexoAluno==1&&pesoAluno>pesoIdeal1){System.out.println("Você precisa perder "+(pesoAluno-pesoIdeal1)+"kg para chegar ao seu peso ideal.");}
        else if(sexoAluno==1&&pesoAluno<pesoIdeal1){System.out.println("Você precisa ganhar "+(pesoIdeal1-pesoAluno)+"kg para chegar ao seu peso ideal.");};
        if (imcAluno<20){System.out.println("Você está abaixo do peso e deve realizar atividades difíceis para ganhar massa muscular");}
        else if (imcAluno>20&&imcAluno<27){System.out.println("Você está no IMC ideal e deve realizar atividades moderadas.");}
        else {System.out.println("Você está acima do peso e deve realizar atividades leves para perder peso");};

        if (idadeAluno<25&&imcAluno<20){System.out.println("Você está na Faixa Etária I, com o IMC abaixo do ideal e deve praticar atividades difíceis, como por exemplo: \n Luta.");}
        else if (idadeAluno<25&&imcAluno>20&&imcAluno<27){System.out.println("Você está na Faixa Etária I, com o IMC ideal e deve praticar atividades moderadas, como por exemplo: \n Musculação moderada e dança.");}
        else if (idadeAluno<25&&imcAluno>27){System.out.println("Você está na Faixa Etária I, com o IMC acima do ideal e deve praticar atividades leves, como por exemplo: \n Musculação leve e ioga.");}
        
        else if (idadeAluno<=35&&imcAluno<20){System.out.println("Você está na Faixa Etária II, com o IMC abaixo do ideal e deve praticar atividades difíceis, como por exemplo: \n Musculação intensa e luta.");}
        else if (idadeAluno<35&&imcAluno>20&&imcAluno<27){System.out.println("Você está na Faixa Etária II, com o IMC ideal e deve praticar atividades moderadas, como por exemplo: \n Musculação moderada, dança e corrida.");}
        else if (idadeAluno<35&&imcAluno>27){System.out.println("Você está na Faixa Etária II, com o IMC acima do ideal e deve praticar atividades leves, como por exemplo: \n Ioga.");}
        
        else if (idadeAluno<=45&&imcAluno<20){System.out.println("Você está na Faixa Etária III, com o IMC abaixo do ideal e deve praticar atividades difíceis, como por exemplo: \n Musculação intensa e luta.");}
        else if (idadeAluno<=45&&imcAluno>20&&imcAluno<27){System.out.println("Você está na Faixa Etária III, com o IMC ideal e deve praticar atividades moderadas, como por exemplo: \n Musculação moderada, dança e corrida.");}
        else if (idadeAluno<=45&&imcAluno>27){System.out.println("Você está na Faixa Etária III, com o IMC acima do ideal e deve praticar atividades leves, como por exemplo: \n Ioga.");}
        
        else if (idadeAluno<=55&&imcAluno<20){System.out.println("Você está na Faixa Etária IV, com o IMC abaixo do ideal e deve praticar atividades difíceis, como por exemplo: \n Pilates e luta.");}
        else if (idadeAluno<=55&&imcAluno>20&&imcAluno<27){System.out.println("Você está na Faixa Etária IV, com o IMC ideal e deve praticar atividades moderadas, como por exemplo: \n Dança, corrida e musculação moderada.");}
        else if (idadeAluno<=55&&imcAluno>27){System.out.println("Você está na Faixa Etária IV, com o IMC acima do ideal e deve praticar atividades leves, como por exemplo: \n Musculação leve e ioga.");}

        else if (idadeAluno<=65&&imcAluno<20){System.out.println("Você está na Faixa Etária V, com o IMC abaixo do ideal e deve praticar atividades difíceis, como por exemplo: \n Pilates.");}
        else if (idadeAluno<=65&&imcAluno>20&&imcAluno<27){System.out.println("Você está na Faixa Etária V, com o IMC ideal e deve praticar atividades moderadas, como por exemplo: \n Corrida e dança.");}
        else if (idadeAluno<=65&&imcAluno>27){System.out.println("Você está na Faixa Etária V, com o IMC acima do ideal e deve praticar atividades leves, como por exemplo: \n Musculação leve e ioga.");}

        else if (idadeAluno>=66&&imcAluno<20){System.out.println("Você está na Faixa Etária VI, com o IMC abaixo do ideal e deve praticar atividades moderadas, como por exemplo: \n Pilates.");}
        else if (idadeAluno>=66&&imcAluno>20&&imcAluno<27){System.out.println("Você está na Faixa Etária VI, com o IMC ideal e deve praticar atividades moderadas, como por exemplo: \n Dança.");}
        else {System.out.println("Você está na Faixa Etária VI, com o IMC acima do ideal e deve praticar atividades leves, como por exemplo: \n Musculação leve e ioga.");}
        ;
    }
}
