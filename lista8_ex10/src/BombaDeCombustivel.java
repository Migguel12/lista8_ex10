public class BombaDeCombustivel {
    String tipoCombustivel;
    double valorLitro;
    double quantidadeCombustivel;

    public BombaDeCombustivel(String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;

        if(tipoCombustivel == "Gasolina"){
        valorLitro = 4.99;
        quantidadeCombustivel = 1000;
    }

    if(tipoCombustivel == "Diesel"){
        valorLitro = 4.85;
        quantidadeCombustivel = 500;
    }

    if(tipoCombustivel == "Alcool"){
        valorLitro = 3.57;
        quantidadeCombustivel = 800;
    }
    }


    public void abastecerPorValor(double valor){
        quantidadeCombustivel = quantidadeCombustivel -  (valor/valorLitro);
    }

    public void abastecerPorLitro(double litro){
        quantidadeCombustivel = quantidadeCombustivel - litro;
    }

    public void alterarLitro(double novoLitro){
        valorLitro = novoLitro;
    }

    public void alterarCombustivel(String novoCombustivel){
        tipoCombustivel = novoCombustivel;
        if(tipoCombustivel == "Gasolina"){
        valorLitro = 4.99;
        quantidadeCombustivel = 1000;
    }

    if(tipoCombustivel == "Diesel"){
        valorLitro = 4.85;
        quantidadeCombustivel = 500;
    }

    if(tipoCombustivel == "Alcool"){
        valorLitro = 3.57;
        quantidadeCombustivel = 800;
    }
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade){
        quantidadeCombustivel = novaQuantidade;
    }

    public double verQuantidadeCombustivel(){
        return quantidadeCombustivel;
    }
    
}
