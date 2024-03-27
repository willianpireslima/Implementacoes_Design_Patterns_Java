package abstractmethod;

public class AbstractMethod {

    static abstract class ProdutoGenerico {
        public int id;
        public abstract void mostrar();
    }

    static class ProdutoA extends ProdutoGenerico {
        ProdutoA(int aux) {
            this.id = aux;
        }
        
        @Override
        public void mostrar() {
            System.out.println("A:" + this.id);
        }
    }

    static class ProdutoB extends ProdutoGenerico {
        ProdutoB(int aux) {
            this.id = aux;
        }
        
        @Override
        public void mostrar() {
            System.out.println("B:" + this.id);
        }
    }
    
    static class ProdutoC extends ProdutoGenerico {
        ProdutoC(int aux) {
            this.id = aux;
        }
        
        @Override
        public void mostrar() {
            System.out.println("C:" + this.id);
        }
    }

    static abstract class AbstractFactoryProduto {
        public abstract ProdutoGenerico criarProduto(int auxId);
    }

    static class FactoryProdutoA extends AbstractFactoryProduto {
        @Override
        public ProdutoGenerico criarProduto(int auxId) {
            return new ProdutoA(auxId);
        }
    }

    static class FactoryProdutoB extends AbstractFactoryProduto {
        @Override
        public ProdutoGenerico criarProduto(int auxId) {
            return new ProdutoB(auxId);
        }
    }
    
    static class FactoryProdutoC extends AbstractFactoryProduto {
        @Override
        public ProdutoGenerico criarProduto(int auxId) {
            return new ProdutoC(auxId);
        }
    }

    public static void main(String[] args) {
        AbstractFactoryProduto factory = new FactoryProdutoA();
        ProdutoGenerico produto = factory.criarProduto(12);
        produto.mostrar();
    }
}
