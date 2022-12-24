public class Main {public static void main(String[] args) { } }

class Cliente {
public String nomecliente;
public String emailcliente;
public String telefonecliente;
public String endereco;

Cliente() {
Pedido coisa = new Pedido();

coisa.preco = 45.00;
coisa.quantidade = 1;
coisa.data = "14/10/22";
}

void realizarLogin() { }
void realizarCadastro() { }
void buscarProduto() { }
void selecionarProduto() { }
void realizarPagamento(boolean cartao) { }
}
class Produto {
public String tipo;
public int quantidade;


void fazerCoisa1() { }
void fazerCoisa2() { }
void fazerCoisa3() { }
}
class Pedido {
public int quantidade;
public double preco;
public String data;
public Produto produto;

Pedido() {
produto = new Produto();

produto.tipo = "Tenis";
produto.quantidade = 4;
}

void fazerCoisa1() { }
void fazerCoisa2() { }
void fazerCoisa3() { }
}
class Compra {
Compra() {
Cliente coisa = new Cliente();

coisa.nomecliente = "Rafael";
Pedido pedido = new Pedido();

pedido.quantidade = 2;
pedido.preco = 100;

}
}
