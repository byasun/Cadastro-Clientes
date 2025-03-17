public class Main {
    public static void main(String[] args) {
        // Criando uma instância de CadastroClientes
        CadastroClientes cadastro = new CadastroClientes();

        // Adicionando alguns clientes
        cadastro.adicionarCliente(new Cliente("João Silva", "123.456.789-00", "joao.silva@example.com"));
        cadastro.adicionarCliente(new Cliente("Maria Oliveira", "987.654.321-00", "maria.oliveira@example.com"));

        // Listando todos os clientes
        System.out.println("Lista de Clientes:");
        cadastro.listarClientes();

        // Buscando um cliente pelo CPF
        String cpfBusca = "123.456.789-00";
        Cliente clienteEncontrado = cadastro.buscarClientePorCpf(cpfBusca);
        if (clienteEncontrado != null) {
            System.out.println("\nCliente encontrado: " + clienteEncontrado);
        } else {
            System.out.println("\nCliente com CPF " + cpfBusca + " não encontrado.");
        }
    }
}