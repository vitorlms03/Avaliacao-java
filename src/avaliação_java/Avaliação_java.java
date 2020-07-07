/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliação_java;
import java.util.Scanner;
/**
 *
 * @author vitor
 */
public class Avaliação_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner entrada = new Scanner (System.in);
         
         String pgm;
         
         System.out.println ("Digite o código do programa que deseja: ");
         pgm = entrada.nextLine();
         
         char pgm2 = pgm.charAt(0);
         while (pgm2 != 0)
         {
             switch (pgm2)
             {
                 case '0': System.exit(0); break;
                 case '1': Exercicio1(); break;
                 case '2': Exercicio2(); break;
                 case '3': Exercicio3(); break;
                 case '4': Exercicio4(); break;
                 case '5': Exercicio5(); break;
                 case '6': Exercicio6(); break;
                 case '7': Exercicio7(); break;
                 case '8': Exercicio8(); break;
                 case '9': Exercicio9(); break;
                 case 'x': Exercicio10(); break;
                 default: System.out.print("erro");
             }
             System.out.print("Digite o código do programa que deseja: ");
             pgm = entrada.nextLine();
             pgm2 = pgm.charAt(0);
         }
    }

    private static void Exercicio1() {
     
     double sexo, pc, alt,i;
     Scanner s = new Scanner (System.in);
     Scanner num = new Scanner (System.in);
     System.out.println("Digite o Sexo,1 para Masculino e 2 para Feminino:");
     sexo = s.nextDouble();
     System.out.println("Digite o Peso:");
     pc = num.nextDouble();
     System.out.println("Digite a altura:");
     alt = num.nextDouble();
     System.out.println("Digite a idade:");
     i = num.nextDouble();
     
     if (sexo == 1)
     {
         double result =  66.47 + (13.75 * pc) + (5 * alt) - (6.76 * i);
         System.out.println("O seu Gasto Energético Basal é "+ result);
     }
     else if(sexo ==2)
     {double result = 655.1 + (9.56 * pc) + (1.85 * alt) - (4.67 * i);
     System.out.println("O seu Gasto Energético Basal é "+ result);
     }
    }
    

    
    private static void Exercicio2() {
       int vlr, c,  d, u, j;
        Scanner num = new Scanner(System.in);
         System.out.println("Digite um número de 0 até 999");
         String extenso, cent = null,dez = null,uni = null;
         vlr = num.nextInt();
         c = vlr/100;
         d = vlr % 100/10;
         u = (vlr % 100)%10;
         j = vlr/1;
         if(c==1&&d==0&&u==0){
         System.out.println("cem");}
         else if(c==0&&d==0&&u==0){
         System.out.println("zero");
         }
         else
         {
            if(c>=1&&d==0&&u==0){
             
            switch(c){
            case 1 :System.out.println("Cento ");
            break;
            case 2 : System.out.println("Duzentos ");
            break;
            case 3 : System.out.println("Trezentos ");
            break;
            case 4 : System.out.println("Quatrocentos ");
            break;
            case 5 : System.out.println("Quinhentos ");
            break;
            case 6 : System.out.println("Seiscentos ");
            break;
            case 7 : System.out.println("Setecentos ");
            break;
            case 8 : System.out.println("Oitocentos ");
            break;
            case 9 : System.out.println("Novecentos ");
            break;
        }
      }
            else
   {
	switch(c)
	{
	case 1 : System.out.println("Cento e ");break;
	case 2 : System.out.println("Duzentos e ");break;
	case 3 : System.out.println("Trezentos e ");break;
	case 4 : System.out.println("Quatrocentos e");break;
	case 5 : System.out.println("Quinhentos e ");break;
	case 6 : System.out.println("Seiscentos e ");break;
	case 7 : System.out.println("Setecentos e ");break;
	case 8 : System.out.println("Oitocentos e ");break;
	case 9 : System.out.println("Novecentos e ");break;
	}
   }
   if(d==1)
   {
	switch(u)
	{
	case 0 : System.out.println("Dez ");break;
	case 1 : System.out.println("Onze ");break;
	case 2 : System.out.println("Doze ");break;
	case 3 : System.out.println("Treze ");break;
	case 4 : System.out.println("Quatorze ");break;
	case 5 : System.out.println("Quinze ");break;
	case 6 : System.out.println("Dezesseis ");break;
	case 7 : System.out.println("Dezessete ");break;
	case 8 : System.out.println("Dezoito ");break;
	case 9 : System.out.println("Dezenove ");break;
	}
   }
   else if(d>1)
   {
	switch (d)
	{
	case 2 : System.out.println("Vinte");break;
	case 3 : System.out.println("Trinta");break;
	case 4 : System.out.println("Quarenta");break;
	case 5 : System.out.println("Cinquenta");break;
	case 6 : System.out.println("Sessenta");break;
	case 7 : System.out.println("Setenta");break;
	case 8 : System.out.println("Oitenta");break;
	case 9 : System.out.println("Noventa");break;
	}
	switch (u)
	{
	case 1 : System.out.println(" e Um ");break;
	case 2 : System.out.println(" e Dois ");break;
	case 3 : System.out.println(" e Tres ");break;
	case 4 : System.out.println(" e Quatro ");break;
	case 5 : System.out.println(" e Cinco ");break;
	case 6 : System.out.println(" e Seis ");break;
	case 7 : System.out.println(" e Sete ");break;
	case 8 : System.out.println(" e Oito ");break;
	case 9 : System.out.println(" e Nove ");break;
	}
   }
   else
   {
	switch (u)
	{
	case 1 : System.out.println("Um ");break;
	case 2 : System.out.println("Dois ");break;
	case 3 : System.out.println("Tres ");break;
	case 4 : System.out.println("Quatro ");break;
	case 5 : System.out.println("Cinco ");break;
	case 6 : System.out.println("Seis ");break;
	case 7 : System.out.println("Sete ");break;
	case 8 : System.out.println("Oito ");break;
	case 9 : System.out.println("Nove ");break;
	}
   }
        extenso = ( cent + dez + uni);
        System.out.println(extenso);
     }
   
     }

    private static void Exercicio3() {
           double a, b, mult;
        Scanner entrada = new Scanner (System.in);  
        System.out.println ("Digite o valor de A:");
        a = entrada.nextInt();
         System.out.println ("Digite o valor de B:");
        b = entrada.nextInt();
        
        if (b>a){
            mult = a;
            a=b;
            b = mult;
        }
        if (a%b==0)
            System.out.println ("São multiplos");
        else
            System.out.println ("Não são multiplos");       
        } 

    private static void Exercicio4() {
             Scanner entrada= new Scanner(System.in);
      int I;
      double a,b,c;
      System.out.println("Escreva 1 ou 2 para valor de I:");
      I = entrada.nextInt();
      System.out.println("Escreva o valor de a:");
      a = entrada.nextDouble();
      System.out.println("Escreva o valor de b:");
      b = entrada.nextDouble();
      System.out.println("Escreva o valor de c:");
      c = entrada.nextDouble();  

if(I==1)
{
    System.out.println (+a +"\n"+b+"\n"+c);
}
else
{
    if(I==2)
    {
        System.out.println (+c+"\n"+b+"\n"+a);
        
    }
}
}

    private static void Exercicio5() {
           Scanner entrada= new Scanner(System.in);
     int hora_extra, hora_falta, h;
     double premio;
    System.out.println("Informe o numero de horas extras ");
    hora_extra = entrada.nextInt();
    System.out.println("Informe o numero de horas falta: ");
    hora_falta = entrada.nextInt();
    
h = (hora_extra) - (2 / 3 * (hora_falta));

if (h >40)
{
double result = 500;  
premio = 500;
System.out.println ("Valor da sua gratificacao é de" + premio);
 }
 else if(h >30 && h <= 40)
 {
 double result = 500;
 premio = 400;
 System.out.println ("Valor da sua gratificacao é de" + premio);
 }

else if (h >20 && h <= 30)
 {
 double result = 300;
 premio = 300;
 System.out.println ("Valor da sua gratificacao é de" + premio);
 }

else if (h >10 && h <= 20)
 {
 double result = 200;
 premio = 200;
 System.out.println ("Valor da sua gratificacao é de" + premio);
 }
 
 else if (h <= 10)
 {
 double result = 100;
 premio = 100;
 System.out.println ("Valor da sua gratificacao é de" + premio);
 }
    }

    private static void Exercicio6() {
            Scanner entrada = new Scanner (System.in);
        
        double hora, result, result2;
        
        System.out.println ("Informe um horário de 0 até 24h: ");
        hora = entrada.nextDouble();
        
        result = hora + 6;
        result2 = result - 24;
        
        System.out.println (result2 +" horas");
    }

    private static void Exercicio7() {
        Scanner scan = new Scanner(System.in);
        
        float i=0;
        float fat=1;
        float a = 1;
        
        while(a>=0){
        System.out.print("Digite um número:" );
        a = scan.nextInt();
        fat+=a;
        i++;
        }
        System.out.println("a média é" +fat/(i-1));
    }

    private static void Exercicio8() {
          Scanner entrada = new Scanner(System.in);
    String cd;
    int quant;
    double pc;
    System.out.println("(C) Cachorro Quente         R$2");
    System.out.println("(R) Refrigerante         R$2,5");
    System.out.println("(S) Sobremesa      R$1,5");
    System.out.println("Digite o codigo  do Alimento: ");
    cd = entrada.nextLine();
    System.out.print("Qual é a quantidade que você deseja?");
    quant = entrada.nextInt();
    int i = 1;
    double pcn = 0;
    while(i!=0){
        if(null ==  cd)
        {
            System.out.println("Só aceita os códigos (C,R e S em Maiúsculo)");
        }
        else
            switch(cd){
            case "C":
                pc = 2*quant;
                System.out.println(quant+ "Refrigerante é R$"+pc);
                pcn += pc;
                break;
            case "R":
                pc = 2.5*quant;
                System.out.println(quant+ "Refrigerante ´R$"+pc);
                pcn +=pc;
                break;
            case "S":
                pc = 1.5*quant;
                System.out.println(quant+ "Refrigerante é R$"+pc);
                pcn +=pc;
                break;
            default:
                System.out.println("Só aceita os códigos(C, R e S em maiusculo)");
                break;
            }
        System.out.print("Digite X para sair ou qualquer letra para continuar:");
        String ss = entrada.next();
        if("X".equals(ss))
        {
            System.out.println("O preço total sairá R$" + pcn);
            i = 0;
        }
        else
        {
            System.out.print("Digite o codigo do Alimento: ");
            cd = entrada.next();
            System.out.print("Qual é a quantidade que você que você deseja?");
            quant = entrada.nextInt();
            i =1;
        }
        System.out.println();
            
    }
    }

    private static void Exercicio9() {
        Scanner entrada = new Scanner (System.in);
      int soma, num, i;
        
      System.out.println ("Informe o valor de n: ");
      num = entrada.nextInt();
        
     soma = 0;
      i = 1;
        
      while (i <= num)
     {
            soma = soma + i;
            i = i + 1;
            System.out.println ("A soma dos "+num +" primeiros números inteiros positivos é igual: "+soma);
      }
    }

    private static void Exercicio10() {
             Scanner entrada = new Scanner (System.in);
        
        int i, a, soma, qtdDiv, num;
        soma = 2;
        qtdDiv = 0;
        
        System.out.println ("Informe um número inteiro e positivo: ");
        num = entrada.nextInt();
        
        for (i=3;i<num;i+=2)
        {
            qtdDiv = 0;
            for(a=1;a<=i;a++)
            {
                if(i%a==0)
                {
                    qtdDiv++;
                }
                if(qtdDiv>2)
                {
                    break;
                }
            }
            if(qtdDiv==2)
            {
                soma+=i;
            }
        }
        System.out.println ("A soma soma dos números primos é igual a: "+soma);
    }
}
 


    

      
    

    
        
    
    


    



    

 