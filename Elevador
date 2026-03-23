//@author gabriel.antunes

public class Elevador {
//constantes
    private static final int MINIMO_PESSOAS = 0;
    private static final int MINIMO_ANDAR = 1;
    
//atributos
    private int capacidadeTotal;
    private int pessoasAtual;
    private int andaresTotal;
    private int andarAtual;
   
//gets
    public int getCapacidadeTotal() {
        return this.capacidadeTotal;
    }
    public int getPessoasAtual() {
        return this.pessoasAtual;
    }
    public int getAndaresTotal() {
        return this.andaresTotal;
    }
    public int getAndarAtual() {
        return this.andarAtual;
    }
    
//sets
    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = Math.max(1, capacidadeTotal);
    }
    public void setAndaresTotal(int andaresTotal) {
        this.andaresTotal = Math.max(MINIMO_ANDAR, andaresTotal);
    }
    
//construtores
     public Elevador(int capacidadeTotal, int andaresTotal){
        setCapacidadeTotal(capacidadeTotal);
        setAndaresTotal(andaresTotal);
        this.pessoasAtual = MINIMO_PESSOAS;
        this.andarAtual = MINIMO_ANDAR;
    }
    
//metodos
    public void entrarPessoas (int qtdEntrando) {
        if (qtdEntrando < 0){
            System.out.println("Valor invalido");
        }
        else{
            int novaQuantidade = getPessoasAtual() + qtdEntrando;
            pessoasAtual = Math.min(novaQuantidade, getCapacidadeTotal());
        }
    }
    
    public void sairPessoas (int qtdSaindo) {
        if (qtdSaindo < 0 || qtdSaindo > getPessoasAtual()){
            System.out.println("Valor invalido");
        }
        else{
           int novaQuantidade = getPessoasAtual() - qtdSaindo;
           pessoasAtual = Math.max(novaQuantidade, MINIMO_PESSOAS);
        }
    }
    
    public void subirAndares (int qtdSubindo) {
        if (qtdSubindo < 0 || qtdSubindo + getAndarAtual() > getAndaresTotal()){
            System.out.println("Valor invalido");
        }
        else{
            int novoAndar = getAndarAtual() + qtdSubindo;
            andarAtual = Math.min(novoAndar, getAndaresTotal());
        }
    }
    
    public void descerAndares (int qtdDescendo) {
        if (qtdDescendo < 0 || getAndarAtual()- qtdDescendo < MINIMO_ANDAR){
            System.out.println("Valor invalido");
        }
        else{
            int novoAndar = getAndarAtual() - qtdDescendo;
            andarAtual = Math.max(novoAndar, MINIMO_ANDAR);
        }
    }
    
    public void relatorio() {
    System.out.println("Relatório do Elevador");
    System.out.println("");
    System.out.println("Capacidade do elevador: " + capacidadeTotal);
    System.out.println("Andares do prédio: " + andaresTotal);
    System.out.println("");
    System.out.println("Pessoas no elevador: " + pessoasAtual);
    System.out.println("Andar atual: " + andarAtual);
    }
}
