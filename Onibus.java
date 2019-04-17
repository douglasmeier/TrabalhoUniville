import java.util.Scanner; // IMPORTANDO O SCANNER PARA ENTRADA DE DADOS 
public class Onibus 
{ 

public static class Cliente 
{ 
private String nome; 
private boolean disponivel; 

} 


public static void main(String args[]) 
{ 
Cliente Onibus[]; 
Onibus = new Cliente[20]; 
for (int i = 0; i<5; i++) 
{ 
Onibus[i] = new Cliente(); 
} 
Scanner input = new Scanner(System.in); 
int i,v, opc; 
int assentos[] = new int[20]; 




do // laco de repeticao at� o usuario escolher a opcao sair 
{ 

System.out.println("\n"); // Pular linha
System.out.println("Onibus da Geston Tio Udo");// tela Inicial

System.out.println("***************************************************************"); 
System.out.println("1- Cadastro de cliente em assento"); 
System.out.println("2- Remover cliente de assento"); 
System.out.println("3- Mostrar assentos"); 
System.out.println("4- Sair"); 
System.out.println("***************************************************************"); 
System.out.println(""); 
System.out.println("Escolha a opcao desejada:"); 
opc = input.nextInt(); 


switch(opc) 
{ 

case 1: // cadastro do cliente em um assento
System.out.println("Escolha o lugar - 0 a 19"); 
i= input.nextInt(); 
if (i <5){ 

if (assentos[i]== 0) // caso o assento esteja vazio
{ 

System.out.printf("Cliente registrado com sucesso no assento %dn", i); // cadastro efetuado com sucesso 
assentos[i]= 1; // assento ocupado 

}else 
{ 
System.out.println("Assento Ocupado!"); // Informa se o assento esta ocupado
} 
}else{ 
System.out.println("Assento Inexistente"); // Informa que o assento não existe
} 
break; 
case 2: 
System.out.println("Escolha o assento"); // remove cliente de um assento 
i= input.nextInt(); 
if (assentos[i]== 0) // se o assento estiver vazio
{ 
System.out.printf("Assento %d encontra-se vazio no momento!n", i); // informa que o assento ja se encontra vazio

}else // se nao 
{ 
System.out.println("Cliente removido do assento com sucesso!"); // remove do assento
assentos[i]= 0; // assento liberado
} 
break; 
case 3:
System.out.println("Listagem de assentos!"); // Mostra todos os assentos e suas situações
for (i=0;i<assentos.length;i++) 
{ 
if (assentos[i]==0) // verifica se o assento está vazio
{ 
System.out.printf("Assento: %d: ----Livre \n",i);// Mostra se o assento esta livre
}else 
{ 
System.out.printf("Assento: %d: ----Ocupado \n",i); // Mostra se o assento esta ocupado
} 
} 
break; 

default: 
System.out.println("Opcao invalida"); // excessão do caso, caso escolha uma opção que não exista
} 

}while(opc!=4); // Quando o usuario digita 4, o programa finaliza

} 

}