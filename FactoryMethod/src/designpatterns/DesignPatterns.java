package designpatterns;

public class DesignPatterns {

    static abstract class ProdutoGenerico {
        public int id;
    }

    static class ProdutoA extends ProdutoGenerico {
        ProdutoA(int aux) {
            this.id = aux;
            System.out.println("A:" + this.id);
        }
    }

    static class ProdutoB extends ProdutoGenerico {
        ProdutoB(int aux) {
            this.id = aux;
            System.out.println("B:" + this.id);
        }
    }
    
    static class ProdutoC extends ProdutoGenerico {
        ProdutoC(int aux) {
            this.id = aux;
            System.out.println("C:" + this.id);
        }
    }

    static class FactoryProduto {

        public ProdutoGenerico getProduto(int auxId, String tipo) {
            if (tipo.equals("A"))
                return new ProdutoA(auxId);
            if (tipo.equals("B"))
                return new ProdutoB(auxId);
            if (tipo.equals("C"))
                return new ProdutoC(auxId);

            return null; // Retornar null em caso de tipo inválido
        }
    }

    public static void main(String[] args) {
        FactoryProduto obj = new FactoryProduto();
        obj.getProduto(12, "A");
    }
}
    

