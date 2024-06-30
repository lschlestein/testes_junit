# Testes de Software
### Testes Unitários
Testa uma única classe ou método. Esses testes são feitos isoladamente.

### Testes de Integração
Testa o funcionamento do conjunto de classes e métodos como um todo. Testa a colaboração da combinação de várias classes e seus métodos, como conjunto.

### Teste Funcional
Testes desenvolvidos sob a ótica do usuário.

Os testes são similares, entre em si, mudando somente o escopo onde são efetuados.

## JUnit

As classes de teste, não tem nada de especial em relação a uma classe normal em Java. O que mudam são algumas anotações e métodos que o JUnit nos fornece para nos auxiliar no escopo de testes.
Por exemplo, se pensarmos em uma classe Calculadora, basta criarmos uma classe TesteCalc e escrevermos seus respecitvos testes.

### Um método de teste utilizando o JUnit, precisa ser anotado com @Test.
Ex.
```java
public class TesteCalc{
@Test
  public void testeSoma(){
  ...
  }
```

### O método de teste, deve explorar a funcionalidade a ser testada.

```java
public class TesteCalc{
  @Test
  public void TesteSoma(){
    Calc c = new Calc();
    int i = c.add(3,2);
  }
}
```
Outra coisa que temos que ter mente, é que precisamos criar o cenário, que será necessário para efetuar o teste da funcionalidade desejada.
Alguns exemeplos, são criar um novo banco de dados, com os registros necessários para efetuar um determinado teste. Criar um arquivo de configuração necessário para explorarmos uma determinada funcionalidade e testa-lá.

E finalmente, após criarmos nossa classe de testes, anotar o método de teste, e criarmos o cenário para nosso teste, precisamos verificar o resultado da execução de nosso teste.

```java
public class TesteCalc{
  @Test
  public void TesteSoma(){
    Calc c = new Calc();
    int i = c.add(3,2);
    assertEquals(5,i);
  }
}
```
O método assetEquals é um dos métodos mais utilizados do JUnit, porém existem vários outros:

assertTrue( );
  Verifica se uma determinada condição é verdadeira.
assertFalse( );
  Verificada se uma determinada condição é falsa.
assertEquals( );
  Verifica se uma determinada condição é igual.
assertNotEquals( );
  Verifica se uma determinada condição não é igual.
assertSame( );
  Verifica se as instâncias de um determinado objeto é o mesmo, ou melhor se as instâncias testadas são as mesmas.
assertNotSame( );
  Verifica se as instâncias não são as mesmas, ou melhor se as instâncias dos objetos testados são diferentes.
assertNull( );
  Verifica se a condição testada retorna uma valor Null.
assertNotNull( );
  Verifica se a condição testada não é Null.
fail( );
  Faz um teste falhar.

Existem mais testes, a lista completa pode ser obtida da documentação do Junit;

[Documentação Junit](https://junit.org/junit4/javadoc/4.12/org/junit/Assert.html)





