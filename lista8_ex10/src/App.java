public class App {
    public static void main(String[] args) throws Exception {
        BombaDeCombustivel bomba1 = new BombaDeCombustivel("Gasolina");
        BombaDeCombustivel bomba2 = new BombaDeCombustivel("Alcool");
        BombaDeCombustivel bomba3 = new BombaDeCombustivel("Diesel");

        System.out.println(bomba1.verQuantidadeCombustivel());
        System.out.println(bomba2.verQuantidadeCombustivel());
        System.out.println(bomba3.verQuantidadeCombustivel());

        bomba1.abastecerPorLitro(40);
        bomba2.abastecerPorLitro(40);
        bomba3.abastecerPorLitro(40);
        System.out.println(bomba1.verQuantidadeCombustivel());
        System.out.println(bomba2.verQuantidadeCombustivel());
        System.out.println(bomba3.verQuantidadeCombustivel());

        

        bomba1.abastecerPorValor(250.00);
        bomba2.abastecerPorValor(100.00);
        bomba3.abastecerPorValor(200.00);
        System.out.println(bomba1.verQuantidadeCombustivel());
        System.out.println(bomba2.verQuantidadeCombustivel());
        System.out.println(bomba3.verQuantidadeCombustivel());

        bomba1.alterarCombustivel("Diesel");
        System.out.println(bomba1.verQuantidadeCombustivel());
        bomba1.abastecerPorLitro(40);
        System.out.println(bomba1.verQuantidadeCombustivel());
        bomba1.alterarQuantidadeCombustivel(1000);
        System.out.println(bomba1.verQuantidadeCombustivel());
        bomba1.alterarCombustivel("Alcool");
        System.out.println(bomba1.verQuantidadeCombustivel());



    }
}
