import java.util.ArrayList;
import java.util.List;

public class CadastroClientes {
    private List<Cliente> clientes;

    // Construtor
    public CadastroClientes() {
        clientes = new ArrayList<>();
    }

    // Método para adicionar um cliente
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Método para listar todos os clientes
    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    // Método para buscar um cliente pelo CPF
    public Cliente buscarClientePorCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }
}