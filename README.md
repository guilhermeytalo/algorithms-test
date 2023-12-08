1.) Criar um método que retorna uma string. Este método vai receber uma string com datas em diferentes formatos e deve retornar a data no formato yyyy MM.
Exemplo de dadas que enviaremos (em chamadas diferentes:
·       01/05/2018
·       01 05 2018
·       01052018
·       2018 05 01
 
2.) Criar um método do que retorna uma string.Este método vai receber uma string array tamanhos diversos).Deve se usar um for para ler todos os campos do array e concatená los
na string que será retornada pelo método.
Exemplo: Vamos enviar {“CARLOS”;”EDUARDO”;”DA”;”COSTA ”;”XAVIER”} e o
método deve retornar “CARLOS EDUARDO DA COSTA XAVIER”. 
 
3.) Criar um método que retorne um inteiro. Este método vai receber um int array ( tamanhos diversos). Deve se usar um for para ler todos os campos do array e encontrar o maior valor.
Exemplo: Vamos enviar {334;568;123;796;225} e o método deve retornar 796.
 
 
4.) O que faz cada comando/função abaixo?
 
1.) int [] abas = {0,1,2};
// Instanceando um array de inteiros com 3 posições

2.) if (documento.startsWith("0")) {
for (int xx=0;xx<10;xx++) {
       if (documento.length() > 1 && documento.startsWith("0"))
             documento = documento.substring(1);
      }
}
// Se o documento começar com 0, entra no for e verifica se o documento tem mais de 1 caractere e se começa com 0, se sim, remove o primeiro caractere
 
3.) StringBuilder txtDados = new StringBuilder();
txtDados.append(“Este é um exemplo de dados para um arquivo”);
String filename = “C:/Arquivos/teste.txt";
writer = new FileWriter(filename);
writer.writeNewFile(txtDados.toString());
// Cria um arquivo txt com o texto “Este é um exemplo de dados para um arquivo” no caminho C:/Arquivos/teste.txt
 
4.)
String dataMovimento = “07/05/2018”;
if(dataMovimento.length() > 9){
      int mesRef = Integer.parseInt(dataMovimento.substring(3,5)) - 1;
      int anoRef = Integer.parseInt(dataMovimento.substring(6,10));
     if (mesRef == 0) {
           mesRef = 12;
          anoRef = anoRef - 1;
           mesAnoX = StringUtil.leftPad(String.valueOf(mesRef),2,"0") + "/" +String.valueOf(anoRef);
     }
}
// Se a dataMovimento tiver mais de 9 caracteres, entra no if e pega o mês e ano da dataMovimento e subtrai 1 do mês, se o mês for 0, seta o mês para 12 e subtrai 1 do ano, depois concatena o mês e ano e seta na variável mesAnoX
 
